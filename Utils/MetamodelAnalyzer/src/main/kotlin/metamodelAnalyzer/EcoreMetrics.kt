package metamodelAnalyzer

data class EcoreMetrics(
    val modelName: String,
    val numClasses: Int,
    val numAttributes: Int,
    val numReferences: Int,
    val numContainments: Int,
    val loc: Int,
    val maxDIT: Int,
    val maxHagg: Int
)