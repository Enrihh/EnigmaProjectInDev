package com.example.enigmaprojectin_dev.network

import android.util.Log
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
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
    fun getImage(){
        service?.getRandomImage()?.enqueue(object : Callback<Answer> {
            override fun onResponse(p0: Call<Answer>, response: Response<Answer>) {

                Log.i("Запрос к серверу","Ответ успешный:${response.body()}")
            }

            override fun onFailure(p0: Call<Answer>, p1: Throwable) {
                Log.i("Запрос к серверу", "Ответа мы не получили")
            }

        })



    }
    }

