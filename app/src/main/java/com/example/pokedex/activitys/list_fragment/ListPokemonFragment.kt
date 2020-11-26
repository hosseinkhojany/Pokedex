package com.example.pokedex.activitys.list_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.example.pokedex.backend.entitys.pokemons


class ListPokemonFragment: Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(context = requireContext()).apply {
            setContent {
                ListPokemonContent(pokemons = pokemons, onPokemonClickListener = {
                    Toast.makeText(context , it.name!! , Toast.LENGTH_LONG).show()
                })
            }
        }
    }


}

