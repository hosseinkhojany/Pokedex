package com.example.pokedex.activitys.list_fragment

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ripple.RippleIndication
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.pokedex.backend.entitys.Pokemon
import com.example.pokedex.backend.entitys.pokemons

@Composable
fun PokemonItem(pokemon: Pokemon, onPokemonClickListener: (Pokemon) -> Unit) {
    Card(shape = RoundedCornerShape(16.dp), elevation = 6.dp, modifier = Modifier.padding(16.dp)
            .clickable(onClick = {onPokemonClickListener(pokemon)}).padding(0.dp).fillMaxWidth()) {
        val image = imageResource(pokemon.image!!)

        ConstraintLayout {
    //        RippleIndication(true, 8.dp,  Color.Yellow)
            //constrains id
            val (poke_image , poke_text) = createRefs()


            Image(asset = image,
                    modifier = Modifier.height(120.dp).fillMaxWidth().constrainAs(poke_image){
                        top.linkTo(parent.top , margin = 8.dp)
                        end.linkTo(parent.end,margin =8.dp)
                        start.linkTo(parent.start,margin =8.dp)


                    })


            Text(text = pokemon.name!!, modifier = Modifier.constrainAs(poke_text) {
                top.linkTo(poke_image.bottom , margin = 8.dp)
                bottom.linkTo(parent.bottom , margin = 8.dp)
                end.linkTo(poke_image.end,margin =8.dp)
                start.linkTo(poke_image.start,margin =8.dp)
            } , color = Color.Black)

        }

    }
}

@Composable
@Preview(showBackground = true)
fun PokemonItemPreview(){
    PokemonItem(pokemon = pokemons[24], onPokemonClickListener = {})
}

