package com.example.pokedex.activitys.list_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.example.pokedex.activitys.single_acivity.ui.PokedexTheme
import com.example.pokedex.backend.entitys.pokemons
import com.example.pokedex.customs.AppBarConfig


class ListPokemonFragment: Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(context = requireContext()).apply {
            setContent {

                PokedexTheme {
                    Column {

                        AppBarConfig(activity = activity , title = "Pokedex")

                        ListPokemonContent(pokemons = pokemons + pokemons + pokemons + pokemons, onPokemonClickListener = {
                            Toast.makeText(context, it.name!!, Toast.LENGTH_LONG).show()
                        })
                    }
                }

            }
        }
    }


}

