package com.example.pokedex.customs

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Row
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import com.example.pokedex.R
import com.example.pokedex.activitys.single_acivity.ui.purple500

@Composable
fun AppBarConfig(title: String,){
    TopAppBar(modifier = Modifier,
            backgroundColor = purple500,
            actions = { Row { Image (asset = imageResource(id = R.drawable.ic_launcher_foreground)) }},
            title = { Row{Text(text = title) }})
}

@Composable
@Preview(showBackground = true)
fun PreviewAppBar(){
        AppBarConfig(title = "Pokedex")
}