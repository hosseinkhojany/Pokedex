package com.example.pokedex.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.pokedex.customs.AnimatedCircle

@Composable
fun ProgressIndicatorAnimation(){
    Box(Modifier.padding(16.dp)){
        AnimatedCircle(
                listOf(23f ,11f),
                colors = listOf(Color.Red , Color.Blue),
                Modifier.preferredHeight(300.dp)
                        .align(Alignment.Center)
                        .fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProgressIndicatorAnimationPreview(){
    MaterialTheme {
        ProgressIndicatorAnimation()
    }
}


