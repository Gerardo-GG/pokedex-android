package com.pichis.pokedex.data.network.models.pokemon

import com.google.gson.annotations.SerializedName
import com.pichis.pokedex.data.network.models.general.NamedAPIResource

data class PokemonDTO (
    val id: Int,
    val name: String,
    @SerializedName("base_experience") val baseExperience: Int,
    val height: Int,
    @SerializedName("is_default") val isDefault: Boolean,
    val order: Int,
    val weight: Int,
    @SerializedName("location_area_encounters") val locationAreaEncounters: String,
    val abilities: List<PokemonAbility>,
    val forms: List<NamedAPIResource>,
    @SerializedName("game_indices") val gameIndices: List<VersionGameIndex>,
    @SerializedName ("held_items") val heldItems: List<PokemonHeldItem>,
    val moves: List<PokemonMove>,
    @SerializedName("past_types") val pastTypes: List<PokemonTypePast>,
    val sprites: PokemonSprites,
    val cries: PokemonCries,
    val species: NamedAPIResource,
    val stats: List<PokemonStat>,
    val types: List<PokemonType>
)
