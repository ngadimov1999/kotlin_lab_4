package com.example.retrofit_example.models

import android.media.Image

data class Pokemon(
    val url: String,
    val name: String,
    val power: String,
    val weight: String,
    val image: Image //8-10 строки я обделался, потому что хз как брать данные с ссылки))))
)