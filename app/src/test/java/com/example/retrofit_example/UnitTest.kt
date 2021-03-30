package com.example.retrofit_example

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class UnitTest {
    @Test
    fun isBulbasaurFirst() {
        GlobalScope.launch(Dispatchers.IO) {
            var title = ApiService.instance().getPokemon("0").body()?.name
            assertEquals(title, "bulbasaur")
        }
    }
}