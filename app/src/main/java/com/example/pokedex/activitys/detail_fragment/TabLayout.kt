package com.example.pokedex.activitys.detail_fragment


import androidx.compose.foundation.layout.*

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.emptyContent
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

import androidx.ui.tooling.preview.Preview



private enum class DemoTabs(val value: String) {
    About("About"),
    Basestat("Basestat"),
    Evolutio("Evolutio"),
    Moves("Moves")
}

@Composable
fun TabLayout() {
    //remember a tab when click others
    val tabsName = remember { DemoTabs.values().map { it.value } }
    var selectedIndex = remember { mutableStateOf(DemoTabs.About.ordinal) }
    val icons = listOf(Icons.Default.Info, Icons.Default.Person, Icons.Default.ShoppingCart)

    Column {
        // Right now Tabs by default don't have changing like viewpager but I think we can handle
        // by overriding right/left swipe on content and updating state of selectedTab or using pager

        //Use ScrollableTabRow for list of tabs
        TabRow(selectedTabIndex = selectedIndex.value) {
            tabsName.forEachIndexed { index, title ->
                Tab(
                    selected = index == selectedIndex.value,
                    onClick = {
                        when (title) {
                            DemoTabs.About.value -> {
                                selectedIndex.value = DemoTabs.About.ordinal
                            }
                            DemoTabs.Basestat.value -> {
                                selectedIndex.value = DemoTabs.Basestat.ordinal
                            }
                            DemoTabs.Evolutio.value -> {
                                selectedIndex.value = DemoTabs.Evolutio.ordinal
                            }
                            DemoTabs.Moves.value -> {
                                selectedIndex.value = DemoTabs.Moves.ordinal
                            }
                        }
//                        selectedIndex.value = DemoTabs.valueOf(title).ordinal
                    },
                    text = { Text(title) }
                )
            }
        }
        Surface(modifier = Modifier.weight(0.5f)) {
            when (selectedIndex.value) {
                DemoTabs.About.ordinal -> {
                    Toprogress()
                }
                DemoTabs.Basestat.ordinal -> {

                }
                DemoTabs.Evolutio.ordinal -> {

                }
                DemoTabs.Moves.ordinal -> {

                }
            }
        }
    }
}




@Preview
@Composable
fun PreviewTabLayout() {
    TabLayout()
}