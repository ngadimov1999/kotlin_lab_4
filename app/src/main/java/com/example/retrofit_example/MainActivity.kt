package com.example.retrofit_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch(Dispatchers.IO) {
            val response = ApiService.instance().getFilm("1")

            val listResponse = ApiService.instance().getListFilms()

            Log.d("TEST_RESP", response.body().toString())
            Log.d("TEST_RESP1", listResponse.body().toString())

            withContext(Dispatchers.Main) {
                val pokemonResponse = listResponse?.body()

                val rv = findViewById<RecyclerView>(R.id.listRv)

                rv.layoutManager = LinearLayoutManager(baseContext)
                val adapter = FilmAdapter()
                rv.adapter = adapter

                if (pokemonResponse != null) {
                    adapter.update(pokemonResponse.pokemonList)
                }
            }
        }
    }
}