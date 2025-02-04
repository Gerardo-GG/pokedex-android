package com.pichis.pokedex.data.network.models.general

data class NamedAPIResourceList(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<NamedAPIResource>
)
