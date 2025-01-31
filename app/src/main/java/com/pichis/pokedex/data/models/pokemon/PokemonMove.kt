package com.pichis.pokedex.data.models.pokemon

import com.google.gson.annotations.SerializedName
import com.pichis.pokedex.data.models.general.NamedAPIResource

data class PokemonMove(
    val move: NamedAPIResource,
    @SerializedName("version_group_details") val versionGroupDetails: List<PokemonMoveVersion>
)