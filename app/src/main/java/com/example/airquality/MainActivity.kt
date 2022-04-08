package com.example.airquality

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.JsonReader
import android.util.Log
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            //.baseUrl("https://api.airvisual.com/v2/
            //.baseUrl("https://jsonplaceholder.typicode.com")
            .baseUrl("https://api.waqi.info/")
            .build()
        val jsonapi = retrofit.create(jsonapi::class.java)
        val mcall: Call<List<model>> = jsonapi.getInfo()
        mcall.enqueue(object: Callback<List<model>>
        {
            override fun onResponse(call: Call<List<model>>, response: Response<List<model>>) {
                val mmodel:List<model> = response.body()!!
                val stringBuilder = StringBuilder()
                for( i in mmodel){
                    stringBuilder.append("\n")
                    //stringBuilder.append(i.currentDataTime)

                }
                val txtUser: TextView = findViewById(R.id.txtUser) as TextView
                txtUser.movementMethod= ScrollingMovementMethod()
                txtUser.text = stringBuilder

            }

            override fun onFailure(call: Call<List<model>>, t: Throwable) {
                Log.e("sumn went wrong", t.message.toString())
            }

        }
        )
    }
}