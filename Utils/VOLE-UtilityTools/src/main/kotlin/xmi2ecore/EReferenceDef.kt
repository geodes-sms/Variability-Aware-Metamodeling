package xmi2ecore

data class EReferenceDef(
    val name: String,
    val lower: Int,
    val upper: Int,
    val typeIndex: Int,
    val containment: Boolean
)

