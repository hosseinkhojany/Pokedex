package com.example.pokedex.activitys.list_fragment

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.ConstraintLayout
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.example.pokedex.activitys.single_acivity.ui.purple200
import com.example.pokedex.backend.entitys.Pokemon

@Composable
fun PokemonItem(pokemon: Pokemon, onPokemonClickListener: () -> Unit) {
    Card(shape = RoundedCornerShape(16.dp), elevation = 6.dp, modifier = Modifier.padding(16.dp).clickable(onClick = {onPokemonClickListener})) {
        val image = imageResource(pokemon.image!!)

        ConstraintLayout {

            //constrains id
            val (poke_image , poke_text) = createRefs()


            Image(asset = image,
                    modifier = Modifier.heightIn(120.dp).fillMaxWidth().constrainAs(poke_image){
                        top.linkTo(parent.top , margin = 8.dp)
                        end.linkTo(parent.end,margin =8.dp)
                        start.linkTo(parent.start,margin =8.dp)


                    })


            androidx.compose.foundation.Text(pokemon.name!!,
                    style = MaterialTheme.typography.h4,
                    color = purple200,
                    modifier = Modifier.padding(bottom = 4.dp
                    ).constrainAs(poke_text) {
                        top.linkTo(poke_image.bottom)
                        end.linkTo(poke_image.end)
                        start.linkTo(poke_image.start)
                    })

        }

    }
}
