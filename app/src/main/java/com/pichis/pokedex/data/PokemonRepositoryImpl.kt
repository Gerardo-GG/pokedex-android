package com.pichis.pokedex.data

import com.pichis.pokedex.data.network.PokemonAPI
import com.pichis.pokedex.domain.entities.PokemonEnitity
import com.pichis.pokedex.domain.interfaces.PokemonRepository
import com.pichis.pokedex.utils.Resource
import javax.inject.Inject

class PokemonRepositoryImpl @Inject constructor(
    private val api: PokemonAPI
): PokemonRepository {

    override suspend fun getAllPokemons(): Resource<List<PokemonEnitity>> {
        val pokemonList = mutableListOf<PokemonEnitity>()

        val listPokemon = try {
            api.getPokemonList()
        } catch (ex: Exception) {
            return Resource.Error("")
        }

        listPokemon.results.forEach { pokemon ->
            val pokemonResponse = try {
                api.getPokemonById(pokemon.name)
            } catch (ex: Exception) {
                return Resource.Error("")
            }

            pokemonList.add(
                PokemonEnitity(
                    id = pokemonResponse.id,
                    name = pokemonResponse.name,
                    order = pokemonResponse.order,
                    imageURL = pokemonResponse.sprites.frontDefault
                )
            )
        }

        return Resource.Success(data = pokemonList)
    }

}