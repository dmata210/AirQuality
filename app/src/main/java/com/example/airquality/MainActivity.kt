package com.example.airquality

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.JsonReader
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.LiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import androidx.lifecycle.Observer


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContentView(R.layout.activity_main)
        val textView :TextView = findViewById(R.id.myTextView)

        val button: Button = findViewById((R.id.button))
        val cityname: EditText = findViewById((R.id.cityname))

        button.setOnClickListener{

            val txtcity = cityname.text.toString()

            val aqiLiveData: LiveData<String> = AqiFetcher().fetchContents(txtcity)
            aqiLiveData.observe(
                this,
                Observer { str ->
                    Log.d("AQIResponseInMainActivity", "Response received: $str")

                    textView.text = str
                })
        }

    }
}