package com.example.pokedex.activitys.list_fragment

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumnForIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.pokedex.R
import com.example.pokedex.activitys.single_acivity.ui.shapes
import com.example.pokedex.backend.entitys.Pokemon
import com.example.pokedex.backend.entitys.pokemons

@Composable
fun ListPokemonContent(pokemons: List<Pokemon> ,onPokemonClickListener: (Pokemon) -> Unit){

    //gridview
    LazyColumnForIndexed(items = pokemons) { index, item ->
        Row{
            PokemonItem(pokemon = item,onPokemonClickListener = onPokemonClickListener)
        }
        Divider()
    }

}

@Composable
fun PokemonItem(pokemon: Pokemon, onPokemonClickListener: (Pokemon) -> Unit){

    Card(
        elevation = 4.dp, modifier = Modifier.fillMaxWidth(1f).clickable(onClick = {onPokemonClickListener(pokemon)}),
        shape = RoundedCornerShape(20.dp)
    ) {
        ConstraintLayout {
            val (image , text) = createRefs()
            //pokemon picture
            Image(modifier = Modifier.constrainAs(image){
                      top.linkTo(parent.top , margin = R.dimen.pokemon_margins.dp)
                      start.linkTo(parent.start , margin = R.dimen.pokemon_margins.dp)
                      end.linkTo(parent.end , margin = R.dimen.pokemon_margins.dp)
            }, asset =  imageResource(id = pokemon.image!!) , contentScale = ContentScale.Crop)

            //pokemon lable
            Text(text = pokemon.name!!, modifier = Modifier.constrainAs(text){
                top.linkTo(image.bottom , margin = R.dimen.pokemon_margins.dp)
                start.linkTo(image.start , margin = R.dimen.pokemon_margins.dp)
                end.linkTo(image.end , margin = R.dimen.pokemon_margins.dp)
                bottom.linkTo(parent.bottom, margin = R.dimen.pokemon_margins.dp)
            })

        }
    }

}

@Preview(showBackground = true)
@Composable
fun Preview_ListPokemonContent(){
    ListPokemonContent( pokemons , onPokemonClickListener = {})
    PokemonItem(pokemon = pokemons[25], onPokemonClickListener = {})
}
