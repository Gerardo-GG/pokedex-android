package com.pichis.pokedex.data.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.pichis.pokedex.data.network.PokemonAPI
import com.pichis.pokedex.domain.entities.PokemonEnitity
import com.pichis.pokedex.utils.Resource
import okio.IOException
import javax.inject.Inject

class PokemonPagingSource @Inject constructor(
    private val api: PokemonAPI
): PagingSource<Int, PokemonEnitity>() {
    override fun getRefreshKey(state: PagingState<Int, PokemonEnitity>): Int? {
        return state.anchorPosition
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, PokemonEnitity> {
        return try {
            val pokemonList = mutableListOf<PokemonEnitity>()
            val page = params.key ?: 0
            val response = api.getPokemonList(offset = page, limit = 20)

            response.results.forEach { pokemon ->
                val pokemonResponse = api.getPokemonById(pokemon.name)

                pokemonList.add(
                    PokemonEnitity(
                        id = pokemonResponse.id,
                        name = pokemonResponse.name,
                        order = pokemonResponse.order,
                        imageURL = pokemonResponse.sprites.frontDefault
                    )
                )
            }

            LoadResult.Page(
                data = pokemonList,
                prevKey = if (page >= 20) page - 20 else null,
                nextKey = if (response.next == null) null else page + 20,
            )
        } catch (ex: IOException) {
            LoadResult.Error(ex)
        }
    }
}