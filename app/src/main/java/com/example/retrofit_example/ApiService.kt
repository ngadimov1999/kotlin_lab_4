package com.example.retrofit_example

import com.example.retrofit_example.models.Pokemon
import com.example.retrofit_example.models.PokemonResponse
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("pokemon-form/{id}")
    suspend fun getPokemon(@Path("id") name: String) : Response<Pokemon>

    @GET("pokemon?limit=200&offset=0")
    suspend fun getListPokemons() : Response<PokemonResponse>


    companion object {
        const val API_URL = "https://pokeapi.co/api/v2/"

        fun instance(): ApiService = Retrofit.Builder()
            .baseUrl(API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}