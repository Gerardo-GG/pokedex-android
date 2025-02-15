package com.pichis.pokedex.domain.interfaces

import com.pichis.pokedex.domain.entities.PokemonEnitity

interface PokemonRepository {

    suspend fun getAllPokemons(): List<PokemonEnitity>

}