package com.example.pokedex.customs


import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.pokedex.R
import com.example.pokedex.activitys.single_acivity.HostActivityXml
import com.example.pokedex.activitys.single_acivity.ui.PokedexTheme


@Composable
fun AppBarConfig(activity: Activity? , title : String){

    TopAppBar(
            modifier = Modifier.clip(shape = RoundedCornerShape(0.dp,0.dp,50.dp,50.dp)).height(70.dp),
            elevation = 0.dp, // No shadow needed
            contentColor = MaterialTheme.colors.onSurface,
            title = { Row { Text(text = title) } },//{ Row { title() } }, // https://issuetracker.google.com/168793068
            navigationIcon = {
                Image(
                        asset = imageFromResource(activity!!.resources , R.mipmap.ic_launcher_foreground),
                        modifier = Modifier
                                .clickable(onClick = {

                                })
                                .padding(horizontal = 16.dp)
                )
            }
    )
    Divider()
}

@Preview
@Composable
fun JetchatAppBarPreview() {
    PokedexTheme {
        AppBarConfig(null ,"Pokedex")
    }
}

@Preview
@Composable
fun JetchatAppBarPreviewDark() {
    PokedexTheme(darkTheme = true) {
        AppBarConfig(null ,"Pokedex")
    }
}