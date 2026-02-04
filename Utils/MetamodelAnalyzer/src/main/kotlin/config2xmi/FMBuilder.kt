package config2xmi

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.*
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class FMBuilder(ecorePath: String) {

    private val rs = ResourceSetImpl()
    private val fmPackage: EPackage
    private val factory: EFactory

    private val rootCls: EClass
    private val subFeatureCls: EClass
    private val mandAssocCls: EClass
    private val optAssocCls: EClass

    init {
        rs.resourceFactoryRegistry.extensionToFactoryMap["ecore"] =
            EcoreResourceFactoryImpl()
        rs.resourceFactoryRegistry.extensionToFactoryMap["xmi"] =
            XMIResourceFactoryImpl()

        val ecoreRes = rs.getResource(
            URI.createFileURI(ecorePath), true
        )

        fmPackage = ecoreRes.contents[0] as EPackage
        rs.packageRegistry[fmPackage.nsURI] = fmPackage

        factory = fmPackage.eFactoryInstance

        rootCls = fmPackage.getEClassifier("RootFeature") as EClass
        subFeatureCls = fmPackage.getEClassifier("SubFeature") as EClass
        mandAssocCls = fmPackage.getEClassifier("MandatoryAssociation") as EClass
        optAssocCls = fmPackage.getEClassifier("OptionalAssociation") as EClass
    }

    fun buildXMI(
        rootNode: FMNode,
        selected: Set<String>,
        outputPath: String
    ) {
        val root = factory.create(rootCls)
        root.eSet(rootCls.getEStructuralFeature("name"), rootNode.name)
        root.eSet(rootCls.getEStructuralFeature("abstract"), true)

        for (c in rootNode.children) {
            if (c.name in selected) {
                val f = buildFeature(c, selected)

                root.getList("feature").add(f)
                root.getList("association")
                    .add(createAssoc(root, f, false))
            }
        }

        val out = rs.createResource(URI.createFileURI(outputPath))
        out.contents.add(root)
        out.save(null)
    }

    private fun buildFeature(
        node: FMNode,
        selected: Set<String>
    ): EObject {
        val f = factory.create(subFeatureCls)
        f.eSet(subFeatureCls.getEStructuralFeature("name"), node.name)
        f.eSet(
            subFeatureCls.getEStructuralFeature("abstract"),
            node.children.isNotEmpty()
        )

        for (c in node.children) {
            if (c.name in selected) {
                val child = buildFeature(c, selected)

                f.getList("subfeatures").add(child)
                f.getList("association")
                    .add(createAssoc(f, child, c.mandatory))
            }
        }
        return f
    }

    private fun createAssoc(
        parent: EObject,
        child: EObject,
        mandatory: Boolean
    ): EObject {
        val cls = if (mandatory) mandAssocCls else optAssocCls
        val a = factory.create(cls)

        a.eSet(cls.getEStructuralFeature("parentfeature"), parent)
        a.eSet(cls.getEStructuralFeature("childfeature"), child)

        return a
    }

    @Suppress("UNCHECKED_CAST")
    private fun EObject.getList(name: String): MutableList<EObject> =
        this.eGet(this.eClass().getEStructuralFeature(name)) as MutableList<EObject>
}
