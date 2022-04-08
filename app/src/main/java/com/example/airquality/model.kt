package com.example.airquality

import com.google.gson.annotations.SerializedName
import java.lang.NullPointerException

/*data class Data(
        val aqi:Int,
        val idx:Int,
        @SerializedName("")
)
data class zero(
        val url:String,
        val name:String,
        val logo:String
)
data class Attributions(
        @SerializedName("0")
        val zzero: zero,


)*/

class model (
        val id:String,
        val currentDataTime:String,
        val utcOffset: String,
        val isDayLightSavingsTime: Boolean,
        val dayOfTheWeek: String,
        val timeZoneName: String,
        val currentFileTime: Int,
        val ordinalDate: String,
        val serviceResponse: Int
        )