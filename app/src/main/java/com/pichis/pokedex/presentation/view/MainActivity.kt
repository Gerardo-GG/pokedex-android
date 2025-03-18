package com.pichis.pokedex.presentation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.paging.compose.collectAsLazyPagingItems
import com.pichis.pokedex.presentation.view.components.PokemonListComponent
import com.pichis.pokedex.presentation.view.theme.PokedexTheme
import com.pichis.pokedex.presentation.viewmodel.PokemonViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: PokemonViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PokedexTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Surface (
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        PokemonList(viewModel)
                    }
                }
            }
        }
    }
}

@Composable
fun PokemonList(viewModel: PokemonViewModel) {
    val stateFlow by viewModel.uiState.collectAsState()
    val pokemonList = viewModel.pokemonList.collectAsLazyPagingItems()

    Column {
        PokemonListComponent(Modifier.weight(1.0F), pokemonList)
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PokedexTheme {
    }
}