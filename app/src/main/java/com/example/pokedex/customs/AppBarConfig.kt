package com.example.pokedex.customs

import androidx.compose.foundation.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun AppBarConfig(title: String,){
    TopAppBar(title = { Text(text = title) } , ) {

    }
}