package com.example.pokedex.activitys.detail_fragment

import androidx.compose.animation.animate
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.imageFromResource
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
            TopAppBar(
                modifier = Modifier.clip(shape = RoundedCornerShape(0.dp, 0.dp, 200.dp, 50.dp))
                    .height(70.dp),
                elevation = 0.dp, // No shadow needed
                contentColor = MaterialTheme.colors.onSurface,
                title = { Row { androidx.compose.foundation.Text(text = " ") } },//{ Row { title() } }, // https://issuetracker.google.com/168793068

            )
        }
        Row(
            modifier = modifier,

            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                fontSize = 12.sp,
                text = stringResource(id = R.string.HP),
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(start = 16.dp,top = 16.dp)
            )
            Text(
                text = "30",
                fontSize = 12.sp,
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(start = 8.dp,top = 16.dp)
            )
            val progress = 0f
            LinearProgressIndicator(
                color = Color.Blue,
                progress = progress,
                modifier = Modifier.padding(start = 8.dp,top = 16.dp, bottom = 8.dp).fillMaxWidth(0.8f)
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
                modifier = Modifier.padding(start = 16.dp)
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
                modifier = Modifier.padding(start = 16.dp)
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
                modifier = Modifier.padding(start = 16.dp)
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
                modifier = Modifier.padding(start = 16.dp)
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
                modifier = Modifier.padding(start = 16.dp)
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
                modifier = Modifier.padding(start = 16.dp)
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