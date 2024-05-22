package com.example.enigmaprojectin_dev.network

import retrofit2.Call
import retrofit2.http.GET

interface Image {
    @GET("breeds/image/random")
    fun getRandomImage(): Call<Answer>

}