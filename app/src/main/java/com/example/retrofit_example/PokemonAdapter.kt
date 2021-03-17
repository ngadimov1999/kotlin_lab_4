package com.example.retrofit_example

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit_example.models.Pokemon
import com.example.retrofit_example.models.PokemonResponse

class PokemonAdapter : RecyclerView.Adapter<PokemonAdapter.PokemonHolder>() {
    var list = listOf<Pokemon>()

    fun update(response: List<Pokemon>) {
        this.list = response
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pok_item, parent, false)
        return PokemonHolder(view)
    }

    override fun getItemCount(): Int = list.count()
        override

    fun onBindViewHolder(holder: PokemonHolder, position: Int) {
        holder.bind(list[position])
    }

    class PokemonHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: Pokemon) {
            view.setOnClickListener {}
            val title = view.findViewById<TextView>(R.id.title)
            title.setOnClickListener {}
            view.findViewById<TextView>(R.id.title).text = item.name
        }
    }
}