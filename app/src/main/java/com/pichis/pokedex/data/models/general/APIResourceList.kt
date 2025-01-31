package com.pichis.pokedex.data.models.general

data class APIResourceList(
    val count: Int,
    val next: String,
    val previous: String,
    val results: List<APIResource>
)
