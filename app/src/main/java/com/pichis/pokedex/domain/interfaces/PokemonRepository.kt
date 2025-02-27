package com.pichis.pokedex.domain.interfaces

import com.pichis.pokedex.domain.entities.PokemonEnitity
import com.pichis.pokedex.utils.Resource

interface PokemonRepository {

    suspend fun getAllPokemons(): Resource<List<PokemonEnitity>>

}