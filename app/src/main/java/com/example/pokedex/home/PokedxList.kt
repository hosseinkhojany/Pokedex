package com.example.pokedex

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pokedex.home.Pokedex

@Composable
fun PokedxList(recipes: List<Pokedex>) {
    LazyColumnFor(items = recipes) { item ->
        pokedexCard(item, Modifier.padding(16.dp))
    }
}
