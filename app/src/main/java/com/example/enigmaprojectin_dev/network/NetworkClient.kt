package com.example.enigmaprojectin_dev.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
class NetworkClient{

private var service: Image? = null

private val logging: HttpLoggingInterceptor = HttpLoggingInterceptor()
    .setLevel(HttpLoggingInterceptor.Level.BODY)

fun initClient() {
    val httpClient: OkHttpClient.Builder = OkHttpClient.Builder()

    httpClient.addInterceptor(logging)

    val retrofit = Retrofit.Builder()
        .baseUrl("https://dog.ceo/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(httpClient.build())
        .build()

    service = retrofit.create(Image::class.java)

}
    }

