package com.example.airquality

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface jsonapi {
    @GET(
        "/feed" +
                "/{id}" +
                "/?token=64058b186dcdf9e05f2abc097493cd51f0b50d93"
    )
    fun fetchContents(@Path("id") name: String): Call<String>


}