package com.pichis.pokedex.data.network.models.pokemon

import com.pichis.pokedex.data.network.models.general.NamedAPIResource

data class PokemonType(
    val slot: Int,
    val type: NamedAPIResource
)