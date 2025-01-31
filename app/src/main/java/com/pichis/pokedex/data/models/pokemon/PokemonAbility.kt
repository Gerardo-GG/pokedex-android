package com.pichis.pokedex.data.models.pokemon

import com.google.gson.annotations.SerializedName
import com.pichis.pokedex.data.models.general.NamedAPIResource

data class PokemonAbility(
    @SerializedName("is_hidden") val isHidden: Boolean,
    val slot: Int,
    val ability: NamedAPIResource
)
