package com.pichis.pokedex.data.network

import com.pichis.pokedex.data.network.models.pokemon.PokemonListDTO
import com.pichis.pokedex.data.network.models.pokemon.PokemonDTO
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonAPI {

    @GET("/api/v2/pokemon")
    suspend fun getPokemonList(): PokemonListDTO

    @GET("/api/v2/pokemon/{id}")
    suspend fun getPokemonById(@Path("id") id: Int): PokemonDTO

}