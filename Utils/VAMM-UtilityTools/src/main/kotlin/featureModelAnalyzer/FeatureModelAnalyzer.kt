package featureModelAnalyzer
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory
import org.w3c.dom.Element
import org.w3c.dom.Node

fun analyzeFeatureModel(file: File): Metrics {
    val metrics = Metrics()

    val factory = DocumentBuilderFactory.newInstance()
    val builder = factory.newDocumentBuilder()
    val doc = builder.parse(file)
    doc.documentElement.normalize()

    val structList = doc.getElementsByTagName("struct")
    if (structList.length == 0) return metrics

    val rootStruct = structList.item(0)
    val rootElement = getFirstElementChild(rootStruct) ?: return metrics

    val levelCounts = mutableMapOf<Int, Int>()
    traverse(rootElement, 1, metrics, levelCounts)

    metrics.height = levelCounts.keys.maxOrNull() ?: 0
    metrics.width = levelCounts.values.maxOrNull() ?: 0

    return metrics
}

fun traverse(
    element: Element,
    depth: Int,
    metrics: Metrics,
    levelCounts: MutableMap<Int, Int>
) {

    levelCounts[depth] = levelCounts.getOrDefault(depth, 0) + 1

    val tag = element.tagName

    // Count groups
    when (tag) {
        "or" -> metrics.orGroups++
        "alt" -> metrics.altGroups++
    }

    // Count abstract / concrete
    val isAbstract = element.getAttribute("abstract") == "true"
    if (isAbstract) {
        metrics.abstractCount++
    } else {
        metrics.concreteCount++
    }

    // Count mandatory / optional
    val isMandatory = element.getAttribute("mandatory") == "true"
    if (isMandatory) {
        metrics.mandatoryCount++
    } else {
        metrics.optionalCount++
    }

    // Traverse children
    val children = element.childNodes
    for (i in 0 until children.length) {
        val node = children.item(i)
        if (node.nodeType == Node.ELEMENT_NODE) {
            traverse(node as Element, depth + 1, metrics, levelCounts)
        }
    }
}

fun getFirstElementChild(node: Node): Element? {
    val children = node.childNodes
    for (i in 0 until children.length) {
        val child = children.item(i)
        if (child.nodeType == Node.ELEMENT_NODE) {
            return child as Element
        }
    }
    return null
}