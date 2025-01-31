package com.pichis.pokedex.data.models.pokemon

import com.pichis.pokedex.data.models.general.NamedAPIResource

data class PokemonType(
    val slot: Int,
    val type: NamedAPIResource
)