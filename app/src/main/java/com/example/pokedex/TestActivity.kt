package com.example.pokedex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.*
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.TransitionDefinition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.pokedex.activitys.single_acivity.ui.PokedexTheme
import com.example.pokedex.backend.entitys.Pokemon
import com.example.pokedex.backend.entitys.pokemons
import com.example.pokedex.customs.AnimatedCircle
import com.example.pokedex.home.ProgressIndicatorAnimation

class TestActivity : AppCompatActivity() {
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokedexTheme {




            }
        }
    }
}


@Composable
fun <T> LazyGridFor(
        items: List<T>,
        rowSize: Int = 2,
        itemContent: @Composable BoxScope.(T) -> Unit,
) {
    val rows = items.chunked(rowSize)
    LazyColumnFor(rows) { row ->
        Row(Modifier.fillParentMaxWidth()) {
            for ((index, item) in row.withIndex()) {
                Box(Modifier.fillMaxWidth(1f / (rowSize - index))) {
                    itemContent(item)
                }
            }
        }
    }
}

@Composable
fun PokemonItem(pokemon: Pokemon){
    
    Card(Modifier.fillMaxWidth() ,elevation = 5.dp) {
        ConstraintLayout() {
            val (image , text) = createRefs()
            
//            Image(asset = pokemon.image , Modifier.height(150.dp).fillMaxWidth())
            
        }
    }
    
    
}


@Preview(showBackground = true)
@Composable
fun PreviewItemPokemon(){

}

@Preview(showBackground = true)
@Composable
fun PreviewListPokemon(){
}




@Composable
fun ListPokemon(){
    LazyGridFor(items = pokemons) {
        PokemonItem(pokemons[25])
    }
}

@Composable
fun StackUsage(){
    PokedexTheme() {
        Surface() {
            Box(Modifier.padding(25.dp).fillMaxSize()){
                Text(text = "Hello" , Modifier.align(Alignment.BottomEnd))
            }
        }
    }
}
        
        
@Preview(showBackground = true)
@Composable
fun Stack_Preview(){
    StackUsage()
}




