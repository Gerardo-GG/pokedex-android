package com.pichis.pokedex.data

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.pichis.pokedex.data.network.PokemonAPI
import com.pichis.pokedex.data.paging.PokemonPagingSource
import com.pichis.pokedex.domain.entities.PokemonEnitity
import com.pichis.pokedex.domain.interfaces.PokemonRepository
import com.pichis.pokedex.utils.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PokemonRepositoryImpl @Inject constructor(
    private val api: PokemonAPI
): PokemonRepository {

    override fun getAllPokemons(): Flow<PagingData<PokemonEnitity>> {
        return Pager(config = PagingConfig(pageSize = 20, prefetchDistance = 8),
            pagingSourceFactory = {
                PokemonPagingSource(api)
            }).flow
    }

}