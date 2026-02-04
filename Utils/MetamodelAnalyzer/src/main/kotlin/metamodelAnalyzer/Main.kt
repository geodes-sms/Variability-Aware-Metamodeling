package metamodelAnalyzer

import java.io.File

    fun main() {
        val outputPath = "results/metamodels.csv"
        exportEcoreMetricsToCSV(
            "metamodels",
            outputPath
        )
        println("Results saved at: $outputPath")
    }

//  CSV Export
fun exportEcoreMetricsToCSV(directoryPath: String, outputPath: String) {
    val metamodelsDir = File(directoryPath)
    val ecoreFiles = metamodelsDir.walk()
        .filter { it.isFile && it.extension == "ecore" }
        .map { it.path }
        .toList()

    val outputFile = File(outputPath)
    outputFile.writeText("model,LOC,classes,attributes,refs,containments,maxDIT,maxHagg\n")
    for (model in ecoreFiles) {
        val metrics = analyzeEcore(model)
        outputFile.appendText(
            "${metrics.modelName},${metrics.loc},${metrics.numClasses}," +
                    "${metrics.numAttributes},${metrics.numReferences},${metrics.numContainments}," +
                    "${metrics.maxDIT},${metrics.maxHagg}\n"
        )
    }
}
