package com.example.pokedex

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.pokedex.activitys.single_acivity.ui.purple200
import com.example.pokedex.activitys.single_acivity.ui.shapes
import com.example.pokedex.activitys.single_acivity.ui.white
import com.example.pokedex.home.Pokedex


@Composable
fun pokedexCard(pokedex: Pokedex, modifier: Modifier) {
    Card(shape = RoundedCornerShape(16.dp), elevation =6.dp, modifier = modifier) {
        val image = imageResource(pokedex.imageResource)

         ConstraintLayout {

                //constrains id
                 val (poke_image , poke_text) = createRefs()


                 Image(asset = image,
                     modifier = Modifier.heightIn(120.dp).fillMaxWidth().constrainAs(poke_image){
                         top.linkTo(parent.top , margin = 8.dp)
                         end.linkTo(parent.end,margin =8.dp)
                         start.linkTo(parent.start,margin =8.dp)


                     })


             Text(pokedex.title,
                     style = MaterialTheme.typography.h4,
                     color = purple200,
                     modifier = Modifier.padding(bottom = 4.dp
                     ).constrainAs(poke_text){
                         top.linkTo(poke_image.bottom)
                         end.linkTo(poke_image.end)
                         start.linkTo(poke_image.start)
                     })

         }


    }
}


@Composable
fun ConstraintLayoutContent() {
    ConstraintLayout {
        // Create references for the composables to constrain
        val (button, text) = createRefs()

        Button(
            onClick = { /* Do something */ },
            // Assign reference "button" to the Button composable
            // and constrain it to the top of the ConstraintLayout
            modifier = Modifier.constrainAs(button) {
                top.linkTo(parent.top, margin = 16.dp)
            }
        ) {
            Text("Button")
        }

        // Assign reference "text" to the Text composable
        // and constrain it to the bottom of the Button composable
        Text("Text", Modifier.constrainAs(text) {
            top.linkTo(button.bottom, margin = 16.dp)
        })
    }
}
@Composable
@Preview
fun DefaultRecipeCard() {
    MaterialTheme {
        pokedexCard(defaultpokedex[0], Modifier.padding(16.dp))
    }
}
