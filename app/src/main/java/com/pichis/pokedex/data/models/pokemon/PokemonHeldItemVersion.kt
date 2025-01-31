package com.pichis.pokedex.data.models.pokemon

import com.pichis.pokedex.data.models.general.NamedAPIResource

data class PokemonHeldItemVersion(
    val version: NamedAPIResource,
    val rarity: Int
)
