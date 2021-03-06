package com.example.pokedex.activitys.list_fragment

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview
import com.example.pokedex.activitys.single_acivity.ui.PokedexTheme
import com.example.pokedex.backend.entitys.Pokemon
import com.example.pokedex.backend.entitys.pokemons
import com.example.pokedex.customs.AppBarConfig

@Composable
fun ListPokemonContent(pokemons: List<Pokemon> ,onPokemonClickListener: (Pokemon) -> Unit){

    //gridview
    LazyGridFor(items = pokemons , 2 ) { it ->
        PokemonItem(pokemon = it, onPokemonClickListener = {onPokemonClickListener(it)})
    }
}

@Preview(showBackground = true)
@Composable
fun Preview_ListPokemonContent(){
    PokedexTheme {
        Column() {
            ListPokemonContent( pokemons , onPokemonClickListener = {})
            PokemonItem(pokemon = pokemons[25], onPokemonClickListener = {})
        }
    }
}
