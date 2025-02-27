package com.pichis.pokedex.core.di

import com.pichis.pokedex.data.PokemonRepositoryImpl
import com.pichis.pokedex.data.network.PokemonAPI
import com.pichis.pokedex.domain.interfaces.PokemonRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun pokemonRepositoryProvider( api: PokemonAPI ): PokemonRepository {
        return PokemonRepositoryImpl(api)
    }

}