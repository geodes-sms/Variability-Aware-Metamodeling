package xmi2ecore

import org.w3c.dom.*
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.*
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

fun transformXmiToEcore(input: File, output: File) {
    val dbf = DocumentBuilderFactory.newInstance()
    dbf.isNamespaceAware = true
    val doc = dbf.newDocumentBuilder().parse(input)

    val eClassNodes = doc.getElementsByTagNameNS(
        "http://www.eclipse.org/emf/2002/Ecore",
        "EClass"
    )

    val classes = mutableListOf<EClassDef>()

    /* ---------- collect classes ---------- */
    for (i in 0 until eClassNodes.length) {
        val node = eClassNodes.item(i) as Element

        val name = node.getAttribute("name").takeIf { it.isNotBlank() }
        val isAbstract = node.getAttribute("abstract") == "true"

        val annotations = node.getElementsByTagName("eAnnotations")
        val annList = mutableListOf<Element>()
        for (j in 0 until annotations.length) {
            annList.add(annotations.item(j) as Element)
        }

        val cls = EClassDef(name, isAbstract, annList)

        /* --- super types --- */
        val superTypes = node.getAttribute("eSuperTypes")
        if (superTypes.startsWith("/")) {
            cls.superTypeIndices.add(superTypes.substring(1).toInt())
        }

        /* --- structural features (EReference) --- */
        val features = node.getElementsByTagName("eStructuralFeatures")
        for (k in 0 until features.length) {
            val f = features.item(k) as Element

            if (f.getAttribute("xsi:type") == "ecore:EReference") {
                val ref = EReferenceDef(
                    name = f.getAttribute("name"),
                    lower = f.getAttribute("lowerBound").toInt(),
                    upper = f.getAttribute("upperBound").toInt(),
                    typeIndex = f.getAttribute("eType").removePrefix("/").toInt(),
                    containment = f.getAttribute("containment") == "true"
                )
                cls.references.add(ref)
            }
        }

        classes.add(cls)
    }

    /* ---------- build Ecore document ---------- */
    val outDoc = dbf.newDocumentBuilder().newDocument()

    val pkg = outDoc.createElementNS(
        "http://www.eclipse.org/emf/2002/Ecore",
        "ecore:EPackage"
    )
    pkg.setAttribute("xmi:version", "2.0")
    pkg.setAttribute("xmlns:xmi", "http://www.omg.org/XMI")
    pkg.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance")
    pkg.setAttribute("xmlns:ecore", "http://www.eclipse.org/emf/2002/Ecore")

    val pkgName = classes.firstOrNull { it.name != null }?.name ?: "Generated"
    pkg.setAttribute("name", pkgName)
    pkg.setAttribute("nsURI", "http://www.example.org/$pkgName")
    pkg.setAttribute("nsPrefix", pkgName)

    outDoc.appendChild(pkg)

    /* ---------- emit classifiers ---------- */
    classes.forEach { cls ->
        if (cls.name == null) return@forEach

        val eCls = outDoc.createElement("eClassifiers")
        eCls.setAttribute("xsi:type", "ecore:EClass")
        eCls.setAttribute("name", cls.name)

        if (cls.isAbstract) {
            eCls.setAttribute("abstract", "true")
        }

        /* --- super types --- */
        if (cls.superTypeIndices.isNotEmpty()) {
            val refs = cls.superTypeIndices.joinToString(" ") {
                "#//${classes[it].name}"
            }
            eCls.setAttribute("eSuperTypes", refs)
        }

        /* --- annotations --- */
        cls.annotations.forEach {
            val imported = outDoc.importNode(it, true)
            eCls.appendChild(imported)
        }

        /* --- references --- */
        cls.references.forEach { ref ->
            val eRef = outDoc.createElement("eStructuralFeatures")
            eRef.setAttribute("xsi:type", "ecore:EReference")
            eRef.setAttribute("name", ref.name)
            eRef.setAttribute("lowerBound", ref.lower.toString())
            eRef.setAttribute("upperBound", ref.upper.toString())
            eRef.setAttribute("containment", ref.containment.toString())
            eRef.setAttribute("eType", "#//${classes[ref.typeIndex].name}")

            eCls.appendChild(eRef)
        }

        pkg.appendChild(eCls)
    }

    /* ---------- write file ---------- */
    val tf = TransformerFactory.newInstance().newTransformer()
    tf.setOutputProperty(OutputKeys.INDENT, "yes")
    tf.transform(DOMSource(outDoc), StreamResult(output))
}