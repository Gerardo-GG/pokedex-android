package com.pichis.pokedex.data.network.models.pokemon

import com.google.gson.annotations.SerializedName
import com.pichis.pokedex.data.network.models.general.NamedAPIResource

data class PokemonMoveVersion(
    @SerializedName("mode_learn_method") val modeLearnMethod: NamedAPIResource,
    @SerializedName("version_group") val versionGroup: NamedAPIResource,
    @SerializedName("level_learned_at") val levelLearnedAt: Int
)
