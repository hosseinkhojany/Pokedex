package com.example.pokedex.activitys.single_acivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.ui.tooling.preview.Preview

import com.example.pokedex.activitys.detail_fragment.DetailPokemonFragment
import com.example.pokedex.activitys.list_fragment.ListPokemonContent
import com.example.pokedex.activitys.list_fragment.ListPokemonFragment
import com.example.pokedex.activitys.single_acivity.ui.PokedexTheme
import com.example.pokedex.R

class HostActivityComposePure : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            navController.setGraph(R.navigation.main_container)

            PokedexTheme {

                NavHost(navController, startDestination = "listpokemon") {
                    composable("listpokemon") { ListPokemonFragment() }
                    composable("detailpokemon") { DetailPokemonFragment() }
                }



                Surface(color = MaterialTheme.colors.background) {
                }
            }
        }
    }
}

