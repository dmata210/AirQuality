package com.example.airquality

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface jsonapi {
    @GET(
        "/feed" +
                "/{id}" +
                "/?token=api_key"
    )
    fun fetchContents(@Path("id") name: String): Call<String>


}