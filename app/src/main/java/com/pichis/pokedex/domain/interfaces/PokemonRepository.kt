package com.pichis.pokedex.domain.interfaces

import androidx.paging.PagingData
import com.pichis.pokedex.domain.entities.PokemonEnitity
import com.pichis.pokedex.utils.Resource
import kotlinx.coroutines.flow.Flow

interface PokemonRepository {

    fun getAllPokemons(): Flow<PagingData<PokemonEnitity>>

}