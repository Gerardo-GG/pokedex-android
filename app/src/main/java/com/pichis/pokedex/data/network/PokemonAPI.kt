package com.pichis.pokedex.data.network

import com.pichis.pokedex.data.network.models.pokemon.PokemonListDTO
import com.pichis.pokedex.data.network.models.pokemon.PokemonDTO
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonAPI {

    @GET("/api/v2/pokemon")
    suspend fun getPokemonList(@Query("offset") offset: Int, @Query("limit") limit: Int = 10): PokemonListDTO

    @GET("/api/v2/pokemon/{name}")
    suspend fun getPokemonById(@Path("name") name: String): PokemonDTO

}