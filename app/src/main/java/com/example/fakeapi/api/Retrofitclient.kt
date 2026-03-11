package com.example.fakeapi.api

import com.example.fakeapi.api.service.Service
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofitclient {

    val api: Service by lazy {

        Retrofit.Builder()

            .baseUrl(Constants.Baseurl)

            .addConverterFactory(GsonConverterFactory.create())

            .build()

            .create(Service::class.java)
    }
}