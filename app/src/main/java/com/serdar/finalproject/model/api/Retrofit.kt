package com.serdar.finalproject.model.api


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {
    private lateinit var retrofit: Retrofit


    fun getClient(): Retrofit {


        retrofit =
            Retrofit.Builder()
                .baseUrl(Constant.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        return retrofit as Retrofit
    }

    fun getClientDaily(): Retrofit {


      retrofit =
            Retrofit.Builder()
                .baseUrl(Constant.baseUrlDaily)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        return retrofit as Retrofit
    }
}