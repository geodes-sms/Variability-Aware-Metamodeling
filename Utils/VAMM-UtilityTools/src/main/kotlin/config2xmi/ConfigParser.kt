package config2xmi

import org.w3c.dom.Element
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory

object  ConfigParser {

    fun selectedFeatures(file: File): Set<String> {
        val selected = mutableSetOf<String>()

        val doc = DocumentBuilderFactory
            .newInstance()
            .newDocumentBuilder()
            .parse(file)

        val nodes = doc.getElementsByTagName("feature")
        for (i in 0 until nodes.length) {
            val el = nodes.item(i) as Element
            val name = el.getAttribute("name")

            if (el.getAttribute("manual") == "selected" ||
                el.getAttribute("automatic") == "selected") {
                selected += name
            }
        }
        return selected
    }
}
