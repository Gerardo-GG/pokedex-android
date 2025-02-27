package com.pichis.pokedex.domain.useCases

import com.pichis.pokedex.domain.entities.PokemonEnitity
import com.pichis.pokedex.domain.interfaces.PokemonRepository
import com.pichis.pokedex.utils.Resource
import javax.inject.Inject

class GetPokemonListUseCase @Inject constructor(
    private val repository: PokemonRepository
) {
    suspend operator fun invoke(): Resource<List<PokemonEnitity>> = repository.getAllPokemons()
}