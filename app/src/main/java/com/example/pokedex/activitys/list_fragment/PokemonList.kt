package com.example.pokedex.activitys.list_fragment

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.pokedex.backend.entitys.pokemons

@Composable
fun <T> LazyGridFor(
        items: List<T>,
        rowSize: Int = 1,
        itemContent: @Composable BoxScope.(T) -> Unit,
) {
    val rows = items.chunked(rowSize)
    LazyColumnFor(rows) { row ->
        Row(Modifier.fillParentMaxWidth()) {
                for ((index, item) in row.withIndex()) {
                    ConstraintLayout(Modifier.fillMaxWidth(1f / (rowSize - index))) {
                    Box(modifier = Modifier.constrainAs(createRef()){
                        top.linkTo(parent.top  )
                        bottom.linkTo(parent.bottom  )
                        end.linkTo(parent.end  )
                        start.linkTo(parent.start  )
                    }) {
                        itemContent(item)
                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun previewMain(){
    LazyGridFor(items = pokemons , 2) {
        PokemonItem(it , onPokemonClickListener = {})
    }
}


