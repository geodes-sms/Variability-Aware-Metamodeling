package featureModelAnalyzer
import java.io.File
import java.io.FileWriter
fun main() {
    val inputFolder = File("analyzer/featureModels")   // <-- change this
    val outputCsv = File("analyzer/results/featureModels.csv")

    val writer = FileWriter(outputCsv)
    writer.append(
        "name,abstract,concrete,mandatory,optional,orGroups,altGroups,height,width\n"
    )

    inputFolder.listFiles { file ->
        file.extension.lowercase() == "xml"
    }?.forEach { file ->

        val metrics = analyzeFeatureModel(file)

        writer.append(
            "${file.nameWithoutExtension}," +
                    "${metrics.abstractCount}," +
                    "${metrics.concreteCount}," +
                    "${metrics.mandatoryCount}," +
                    "${metrics.optionalCount}," +
                    "${metrics.orGroups}," +
                    "${metrics.altGroups}," +
                    "${metrics.height}," +
                    "${metrics.width}\n"
        )
    }

    writer.flush()
    writer.close()
    println("Results saved to ${outputCsv.absolutePath}")
}
