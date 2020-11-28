package com.example.pokedex.activitys.list_fragment

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview
import com.example.pokedex.backend.entitys.Pokemon
import com.example.pokedex.backend.entitys.pokemons

@Composable
fun ListPokemonContent(pokemons: List<Pokemon> ,onPokemonClickListener: (Pokemon) -> Unit){

    //gridview
    LazyGridFor(items = pokemons , 2) {
        PokemonItem(pokemon = it, onPokemonClickListener = {onPokemonClickListener(it)})
    }
}

@Preview(showBackground = true)
@Composable
fun Preview_ListPokemonContent(){
    ListPokemonContent( pokemons , onPokemonClickListener = {})
    PokemonItem(pokemon = pokemons[25], onPokemonClickListener = {})
}
