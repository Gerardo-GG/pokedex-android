package com.pichis.pokedex.data.network.models.pokemon

import com.google.gson.annotations.SerializedName
import com.pichis.pokedex.data.network.models.general.NamedAPIResource

data class PokemonTypePast(
    @SerializedName("generation") val generation: NamedAPIResource,
    @SerializedName("types") val types: List<PokemonType>
)
