package com.example.airquality

data class model(
        val `data`: Data,
        val status: String
) {
        data class Data(
                val aqi: Int,
                val attributions: List<Attribution>,
                val city: City,
                val debug: Debug,
                val dominentpol: String,
                val forecast: Forecast,
                val iaqi: Iaqi,
                val idx: Int,
                val time: Time
        ) {
                data class Attribution(
                        val logo: String,
                        val name: String,
                        val url: String
                )

                data class City(
                        val geo: List<Double>,
                        val location: String,
                        val name: String,
                        val url: String
                )

                data class Debug(
                        val sync: String
                )

                data class Forecast(
                        val daily: Daily
                ) {
                        data class Daily(
                                val o3: List<O3>,
                                val pm10: List<Pm10>,
                                val pm25: List<Pm25>,
                                val uvi: List<Uvi>
                        ) {
                                data class O3(
                                        val avg: Int,
                                        val day: String,
                                        val max: Int,
                                        val min: Int
                                )

                                data class Pm10(
                                        val avg: Int,
                                        val day: String,
                                        val max: Int,
                                        val min: Int
                                )

                                data class Pm25(
                                        val avg: Int,
                                        val day: String,
                                        val max: Int,
                                        val min: Int
                                )

                                data class Uvi(
                                        val avg: Int,
                                        val day: String,
                                        val max: Int,
                                        val min: Int
                                )
                        }
                }

                data class Iaqi(
                        val h: H,
                        val no2: No2,
                        val o3: O3,
                        val p: P,
                        val pm25: Pm25,
                        val so2: So2,
                        val t: T,
                        val w: W,
                        val wg: Wg
                ) {
                        data class H(
                                val v: Double
                        )

                        data class No2(
                                val v: Double
                        )

                        data class O3(
                                val v: Int
                        )

                        data class P(
                                val v: Double
                        )

                        data class Pm25(
                                val v: Int
                        )

                        data class So2(
                                val v: Double
                        )

                        data class T(
                                val v: Double
                        )

                        data class W(
                                val v: Double
                        )

                        data class Wg(
                                val v: Int
                        )
                }

                data class Time(
                        val iso: String,
                        val s: String,
                        val tz: String,
                        val v: Int
                )
        }
}