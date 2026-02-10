package xmi2ecore

import java.io.File

fun main() {
    val inputFolder = File("parser/xmi2ecore/input")
    val outputFolder = File("parser/xmi2ecore/output")

    if (!outputFolder.exists()) outputFolder.mkdirs()

    val xmiFiles = inputFolder.listFiles { f -> f.isFile && f.extension == "xmi" } ?: return

    for (xmiFile in xmiFiles) {
        val ecoreFileName = xmiFile.nameWithoutExtension + ".ecore"
        val outputFile = File(outputFolder, ecoreFileName)

        transformXmiToEcore(xmiFile, outputFile)

        println("Transformed ${xmiFile.name} -> ${outputFile.name}")
    }
}
