package com.example.retrofit_example.models

import com.google.gson.annotations.SerializedName

data class PokemonResponse (
    @SerializedName("results") val pokemonList: List<Pokemon>
)