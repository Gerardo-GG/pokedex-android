package com.pichis.pokedex.data.network.models.pokemon

import com.google.gson.annotations.SerializedName
import com.pichis.pokedex.data.network.models.general.NamedAPIResource

data class PokemonAbility(
    @SerializedName("is_hidden") val isHidden: Boolean,
    val slot: Int,
    val ability: NamedAPIResource
)
