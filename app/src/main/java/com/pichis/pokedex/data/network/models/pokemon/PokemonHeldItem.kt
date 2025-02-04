package com.pichis.pokedex.data.network.models.pokemon

import com.google.gson.annotations.SerializedName
import com.pichis.pokedex.data.network.models.general.NamedAPIResource

data class PokemonHeldItem (
    val item: NamedAPIResource,
    @SerializedName("version_details") val versionDetails: List<PokemonHeldItemVersion>
)