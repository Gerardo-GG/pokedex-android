package com.pichis.pokedex.data.network.models.pokemon

import com.pichis.pokedex.data.network.models.general.NamedAPIResource

data class PokemonHeldItemVersion(
    val version: NamedAPIResource,
    val rarity: Int
)
