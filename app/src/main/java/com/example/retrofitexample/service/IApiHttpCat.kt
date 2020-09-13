package com.example.retrofitexample.service

import com.example.retrofitexample.data.model.HttpCatModel
import retrofit2.Call
import retrofit2.http.GET

interface IApiHttpCat{
    @GET("/http.json")
    suspend fun getHttpCatList(): List<HttpCatModel>
}