package com.pichis.pokedex.data

import com.pichis.pokedex.data.network.PokemonAPI
import javax.inject.Inject

class PokemonRepository @Inject constructor(
    private val api: PokemonAPI
) {

    suspend fun getAllCharacters() {

    }

}