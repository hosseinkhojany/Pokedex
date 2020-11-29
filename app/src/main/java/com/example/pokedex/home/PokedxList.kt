package com.example.pokedex.home

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pokedex.pokedexCard

@Composable
fun PokedxList(pokemons: List<Pokedex>) {
    LazyColumnFor(items = pokemons) { item ->
        pokedexCard(item , modifier = Modifier.padding(16.dp))
    }


}
