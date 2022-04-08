package com.example.airquality

import retrofit2.Call
import retrofit2.http.GET

interface jsonapi {
    //https://jsonplaceholder.typicode.com/posts
    //http://api.airvisual.com/v2/city?city=Los Angeles&state=California&country=USA&key={{5528f948-111b-4dc3-aa33-3dd74655c7a1}}
    //https://api.waqi.info/feed/sanantonio/?token=64058b186dcdf9e05f2abc097493cd51f0b50d93
    //@GET("posts")
    //@GET("countries?key={{5528f948-111b-4dc3-aa33-3dd74655c7a1}}")
    @GET("feed/sanantonio/?token=64058b186dcdf9e05f2abc097493cd51f0b50d93")
    //@GET("now")
    fun getInfo(): Call<List<model>>
    //fun getInfo(): Single


}