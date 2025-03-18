package com.pichis.pokedex.domain.useCases

import androidx.paging.PagingData
import com.pichis.pokedex.domain.entities.PokemonEnitity
import com.pichis.pokedex.domain.interfaces.PokemonRepository
import com.pichis.pokedex.utils.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetPokemonListUseCase @Inject constructor(
    private val repository: PokemonRepository
) {
    operator fun invoke(): Flow<PagingData<PokemonEnitity>> = repository.getAllPokemons()
}