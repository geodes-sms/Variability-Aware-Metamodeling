import config2xmi.ConfigParser
import config2xmi.FMBuilder
import config2xmi.FMNode
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory
import org.w3c.dom.Element

fun main() {
    val path = "parser/config2xmi/"
    val ecorePath = path + "FM.ecore"
    val projectsPath = File(path + "projects") // folder with subfolders per project
    val outputBasePath = File(path + "output")

    if (!outputBasePath.exists()) outputBasePath.mkdirs()

    // Iterate over each project folder
    projectsPath.listFiles { f -> f.isDirectory }?.forEach { projectFolder ->
        val fmFiles = projectFolder.listFiles { f -> f.extension == "xml" && f.name.contains("_fm") } ?: return@forEach
        val configFiles = projectFolder.listFiles { f -> f.extension == "xml" && f.name.contains("_config") } ?: return@forEach

        for (fmFile in fmFiles) {
            for (configFile in configFiles) {
                // 1. Parse configuration.xml
                val selectedFeatures = ConfigParser.selectedFeatures(configFile)
                if (selectedFeatures.isEmpty()) continue

                // 2. Parse FeatureIDE XML → build FMNode tree
                val featureTreeRoot = parseFeatureModelXml(fmFile)

                // 3. Filter tree based on selected features
                val filteredTree = filterTree(featureTreeRoot, selectedFeatures)
                    ?: continue

                // 4. Build output filename: featuremodelName_configurationName.xmi
                val fmName = fmFile.nameWithoutExtension.replace("_fm", "")
                val configName = configFile.nameWithoutExtension.replace("_config", "")
                val outputPath = File(outputBasePath, "${fmName}_${configName}.xmi").absolutePath

                // 5. Build XMI
                val builder = FMBuilder(ecorePath)
                builder.buildXMI(filteredTree, selectedFeatures, outputPath)

                println("Generated XMI: $outputPath")
            }
        }
    }
}


fun parseFeatureModelXml(file: File): FMNode {
    val doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file)
    val struct = doc.documentElement.getElementsByTagName("struct").item(0) as Element
    val rootElement = struct.firstChildElement() ?: error("No root feature found")
    return parseFeatureElement(rootElement)
}

// Recursively parse elements (<and>, <or>, <alt>, <feature>) into FMNode
fun parseFeatureElement(elem: Element): FMNode {
    val name = elem.getAttribute("name")
    val mandatory = elem.getAttribute("mandatory") == "true"

    val children = elem.childElements()
        .filter { it.tagName in setOf("and", "or", "alt", "feature") }
        .map { parseFeatureElement(it) }

    return FMNode(name = name, mandatory = mandatory, children = children)
}

// Filter FMNode tree by selected features
fun filterTree(node: FMNode, selected: Set<String>): FMNode? {
    if (node.name !in selected && node.children.none { it.name in selected }) return null
    val filteredChildren = node.children.mapNotNull { filterTree(it, selected) }
    return node.copy(children = filteredChildren)
}

// DOM helpers
fun Element.childElements() = (0 until childNodes.length)
    .map { childNodes.item(it) }
    .filterIsInstance<Element>()
fun Element.firstChildElement(): Element? = childElements().firstOrNull()
