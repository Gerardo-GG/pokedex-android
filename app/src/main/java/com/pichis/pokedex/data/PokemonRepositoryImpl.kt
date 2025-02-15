package com.pichis.pokedex.data

import com.pichis.pokedex.data.network.PokemonAPI
import com.pichis.pokedex.domain.entities.PokemonEnitity
import com.pichis.pokedex.domain.interfaces.PokemonRepository
import javax.inject.Inject

class PokemonRepositoryImpl @Inject constructor(
    private val api: PokemonAPI
): PokemonRepository {

    override suspend fun getAllPokemons(): List<PokemonEnitity> {

    }

}