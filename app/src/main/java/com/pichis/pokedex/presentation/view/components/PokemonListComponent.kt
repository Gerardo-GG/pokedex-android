package com.pichis.pokedex.presentation.view.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.paging.compose.LazyPagingItems
import com.pichis.pokedex.domain.entities.PokemonEnitity

@Composable
fun PokemonListComponent(modifier: Modifier = Modifier, items: LazyPagingItems<PokemonEnitity>) {
    LazyColumn (
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        items(items.itemCount) {
            items[it]?.let { pokemon ->
                Column {
                    Text(pokemon.id.toString())
                    Text(pokemon.name)
                    Text(pokemon.imageURL)
                }
            }
        }
    }
}