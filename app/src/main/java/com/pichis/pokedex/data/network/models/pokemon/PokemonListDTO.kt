package com.pichis.pokedex.data.network.models.pokemon

import com.pichis.pokedex.data.network.models.general.NamedAPIResource

data class PokemonListDTO (
    val count: Int,
    val next: String,
    val previous: String,
    val results: List<NamedAPIResource>
)