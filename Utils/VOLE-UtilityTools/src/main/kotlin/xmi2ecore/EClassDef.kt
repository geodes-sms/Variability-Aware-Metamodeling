package xmi2ecore

import org.w3c.dom.Element


data class EClassDef(
    val name: String?,
    val isAbstract: Boolean,
    val annotations: List<Element>,
    val superTypeIndices: MutableList<Int> = mutableListOf(),
    val references: MutableList<EReferenceDef> = mutableListOf()
)
