package com.example.retrofitexample.data.model

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class HttpCatModel(
    @SerialName("description")
    val description: String = "",
    @SerialName("imageUrl")
    val imageUrl: String = "",
    @SerialName("statusCode")
    val statusCode: Int = 0
)