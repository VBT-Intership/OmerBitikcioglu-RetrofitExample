package com.example.retrofitexample

import com.example.retrofitexample.service.IApiHttpCat
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Retrofit
import retrofit2.create

object RetrofitProvider {
    private const val BASE_URL: String = "https://hwasampleapi.firebaseio.com"
    private val contentType: MediaType = MediaType.get("application/json")
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(Json.asConverterFactory(contentType))
        .build();

    val catsApi = retrofit.create<IApiHttpCat>()
}