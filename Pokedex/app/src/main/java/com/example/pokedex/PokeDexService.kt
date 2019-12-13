package com.example.pokedex

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeDexService {
    @GET("pokemon/{pokemon}")
    fun buscarPokemon(@Path("pokemon")pokemon: String) :
            Call<Pokemon>
}