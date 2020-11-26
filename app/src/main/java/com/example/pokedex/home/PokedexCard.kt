package com.example.pokedex

import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ContainerAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.onPositioned
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.pokedex.activitys.single_acivity.ui.white
import com.example.pokedex.home.Pokedex


@Composable
fun pokedexCard(pokedex: Pokedex, modifier: Modifier) {
    Surface(shape = RoundedCornerShape(6.dp), elevation =6.dp, modifier = modifier) {
        val image = imageResource(pokedex.imageResource)

        Column(/*modifier = Modifier.fillMaxWidth(),*/modifier=Modifier.background(Color(0xFFBB86FC))) {

            Image(asset = image, contentScale = ContentScale.Crop, modifier = Modifier.wrapContentHeight().fillMaxWidth())

            Column(modifier = Modifier.padding(16.dp)) {
                Text(pokedex.title, style = MaterialTheme.typography.h4,color = white, modifier = Modifier.padding(bottom = 4.dp
                ))

            }
        }
    }
}

@Composable
@Preview
fun DefaultRecipeCard() {
    MaterialTheme {
        pokedexCard(defaultpokedex[0], Modifier.padding(16.dp))
    }
}
