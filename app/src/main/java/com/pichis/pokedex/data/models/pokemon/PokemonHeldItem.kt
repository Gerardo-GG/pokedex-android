package com.pichis.pokedex.data.models.pokemon

import com.google.gson.annotations.SerializedName
import com.pichis.pokedex.data.models.general.NamedAPIResource

data class PokemonHeldItem (
    val item: NamedAPIResource,
    @SerializedName("version_details") val versionDetails: List<PokemonHeldItemVersion>
)