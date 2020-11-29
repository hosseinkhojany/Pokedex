package com.example.pokedex.activitys.detail_fragment

import androidx.compose.animation.animate
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProgressIndicatorConstants
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import com.example.pokedex.R

@Composable
fun Toprogress(modifier: Modifier = Modifier) {
/*
    var progress by remember {  mutableListOf(0.1f) }
    val animatedProgress = animate(
        target = progress,
        animSpec = ProgressIndicatorConstants.DefaultProgressAnimationSpec
    )
*/

    Column(modifier = modifier) {

        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                fontSize = 12.sp,
                text = stringResource(id = R.string.HP),
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(start = 4.dp)
            )
            Text(
                text = "30",
                fontSize = 12.sp,
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(start = 8.dp)
            )
            val progress = 0f
            LinearProgressIndicator(
                color = Color.Blue,
                progress = progress,
                modifier = Modifier.padding(start = 8.dp,top = 8.dp, bottom = 8.dp).fillMaxWidth(0.8f)
            )
        }

        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                fontSize = 12.sp,
                text = stringResource(id = R.string.Attack),
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(start = 4.dp)
            )
            Text(
                text = "30",
                fontSize = 12.sp,
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(start = 8.dp)
            )
            val progress = 0f
            LinearProgressIndicator(
                color = Color.Red,
                progress = progress,
                modifier = Modifier.padding(start = 8.dp,top = 8.dp, bottom = 8.dp).fillMaxWidth(0.8f)
            )
        }

        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                fontSize = 12.sp,
                text = stringResource(id = R.string.Defence),
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(start = 4.dp)
            )
            Text(
                text = "30",
                fontSize = 12.sp,
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(start = 8.dp)
            )
            val progress = 0f
            LinearProgressIndicator(
                color = Color.Yellow,
                progress = progress,
                modifier = Modifier.padding(start = 8.dp,top = 8.dp, bottom = 8.dp).fillMaxWidth(0.8f)
            )
        }
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                fontSize = 12.sp,
                text = stringResource(id = R.string.spAtk),
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(start = 4.dp)
            )
            Text(
                text = "30",
                fontSize = 12.sp,
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(start = 8.dp)
            )
            val progress = 0f
            LinearProgressIndicator(
                color = Color.Green,
                progress = progress,
                modifier = Modifier.padding(start = 8.dp,top = 8.dp, bottom = 8.dp).fillMaxWidth(0.8f)
            )
        }
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                fontSize = 12.sp,
                text = stringResource(id = R.string.spDef),
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(start = 4.dp)
            )
            Text(
                text = "30",
                fontSize = 12.sp,
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(start = 8.dp)
            )
            val progress = 0f
            LinearProgressIndicator(
                color = Color.Cyan,
                progress = progress,
                modifier = Modifier.padding(start = 8.dp,top = 8.dp, bottom = 8.dp).fillMaxWidth(0.8f)
            )
        }
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                fontSize = 12.sp,
                text = stringResource(id = R.string.Speed),
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(start = 4.dp)
            )
            Text(
                text = "30",
                fontSize = 12.sp,
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(start = 8.dp)
            )
            val progress = 0f
            LinearProgressIndicator(
                color = Color.LightGray,
                progress = progress,
                modifier = Modifier.padding(start = 8.dp,top = 8.dp, bottom = 8.dp).fillMaxWidth(0.8f)
            )
        }
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                fontSize = 12.sp,
                text = stringResource(id = R.string.Total),
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(start = 4.dp)
            )
            Text(
                text = "30",
                fontSize = 12.sp,
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(start = 8.dp)
            )
            val progress = 0f
            LinearProgressIndicator(
                color = Color.Red,
                progress = progress,
                modifier = Modifier.padding(start = 8.dp,top = 8.dp, bottom = 8.dp).fillMaxWidth(0.8f)
            )
        }
    }

}

@Preview
@Composable
fun ToDometerTitlePreview() {
    Box {
        Toprogress()
    }
}