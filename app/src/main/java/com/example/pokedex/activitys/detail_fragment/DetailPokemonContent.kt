package com.example.pokedex.activitys.detail_fragment

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TabPosition
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.pokedex.activitys.single_acivity.ui.PokedexTheme

@Composable
fun DetailPokemonContents(modifier: Modifier = Modifier) {


    Column(modifier = modifier) {
        Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically
        ) {
            TopAppBar(
                    modifier = Modifier.clip(shape = RoundedCornerShape(0.dp, 0.dp, 200.dp, 50.dp))
                            .height(70.dp),
                    elevation = 0.dp, // No shadow needed
                    contentColor = MaterialTheme.colors.onSurface,
                    title = { Row { androidx.compose.foundation.Text(text = " ") } },//{ Row { title() } }, // https://issuetracker.google.com/168793068

            )
        }


    }

}

    @Preview
    @Composable

fun DetailPokemonContents(){
        Box {
        DetailPokemonContents()
    }
}


