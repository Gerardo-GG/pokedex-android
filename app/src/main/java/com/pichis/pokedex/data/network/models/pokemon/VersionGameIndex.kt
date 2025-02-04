package com.pichis.pokedex.data.network.models.pokemon

import com.google.gson.annotations.SerializedName
import com.pichis.pokedex.data.network.models.general.NamedAPIResource

data class VersionGameIndex(
    @SerializedName("game_index") val gameIndex: Int,
    val version: NamedAPIResource
)