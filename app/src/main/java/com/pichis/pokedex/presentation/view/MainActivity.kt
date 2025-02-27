package com.pichis.pokedex.presentation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pichis.pokedex.domain.entities.PokemonEnitity
import com.pichis.pokedex.presentation.view.theme.PokedexTheme
import com.pichis.pokedex.presentation.viewmodel.PokemonViewModel
import com.pichis.pokedex.utils.UIState
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

        viewModel.getListPokemon()
    }
}

@Composable
fun PokemonList(viewModel: PokemonViewModel) {
    val stateFlow by viewModel.uiState.collectAsState()

    Column {
        when( val state = stateFlow ) {
            is UIState.Error -> {
                Text(state.message)
            }
            is UIState.Success -> {
                state.response.let {
                    LazyColumn (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .weight(1.0F)
                    ) {
                        items(it) { pokemon ->
                            Column {
                                Text(pokemon.id.toString())
                                Text(pokemon.name)
                                Text(pokemon.imageURL)
                            }
                        }
                    }
                }
            }
            is UIState.Loading -> {

            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PokedexTheme {
    }
}