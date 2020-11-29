package com.example.pokedex.activitys.detail_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.example.pokedex.activitys.single_acivity.ui.PokedexTheme


class DetailPokemonFragment: Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return ComposeView(context = requireContext()).apply {
            setContent {

                PokedexTheme {

                    Column {

                        //AppBarConfiguration

                        DetailPokemonContent()

                    }
                }
            }
        }
    }
}