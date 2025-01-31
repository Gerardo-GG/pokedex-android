package com.pichis.pokedex.data.models.pokemon

import com.google.gson.annotations.SerializedName
import com.pichis.pokedex.data.models.general.NamedAPIResource

data class PokemonStat (
    val stat: NamedAPIResource,
    val effor: Int,
    @SerializedName("base_stat") val baseStat: Int
)