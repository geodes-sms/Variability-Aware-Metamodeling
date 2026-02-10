package config2xmi

data class FMNode(
    val name: String,
    val mandatory: Boolean,
    val abstract: Boolean,
    val children: List<FMNode> = emptyList()
)

