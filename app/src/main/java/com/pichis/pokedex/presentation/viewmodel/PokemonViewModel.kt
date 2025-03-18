package com.pichis.pokedex.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pichis.pokedex.domain.entities.PokemonEnitity
import com.pichis.pokedex.domain.useCases.GetPokemonListUseCase
import com.pichis.pokedex.utils.Resource
import com.pichis.pokedex.utils.UIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(
    private val pokemonListUseCase: GetPokemonListUseCase
): ViewModel() {

    private val _uiState = MutableStateFlow<UIState<List<PokemonEnitity>>>(UIState.Loading())
    val uiState = _uiState

    val pokemonList = pokemonListUseCase()
}