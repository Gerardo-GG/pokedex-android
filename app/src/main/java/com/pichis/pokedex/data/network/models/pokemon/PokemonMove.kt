package com.pichis.pokedex.data.network.models.pokemon

import com.google.gson.annotations.SerializedName
import com.pichis.pokedex.data.network.models.general.NamedAPIResource

data class PokemonMove(
    val move: NamedAPIResource,
    @SerializedName("version_group_details") val versionGroupDetails: List<PokemonMoveVersion>
)