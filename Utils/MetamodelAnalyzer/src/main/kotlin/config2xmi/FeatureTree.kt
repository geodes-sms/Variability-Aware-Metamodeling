package config2xmi

data class FMNode(
    val name: String,
    val mandatory: Boolean,
    val children: List<FMNode> = emptyList()
)
