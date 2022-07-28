package com.serdar.finalproject.model.api

import com.serdar.finalproject.model.api.daily.DailyModel
import com.serdar.finalproject.model.horoscope.HoroscopeModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {

    @POST("/")

    fun listPost(
        @Query("sign") sign: String,
        @Query("day") day: String,
        @Query("rapidapi-key")
        rapidapikey: String = "api-key"
    ):
            Call<HoroscopeModel>


    @GET("/advice")

    fun listPostDaily(


    ): Call<DailyModel>
}