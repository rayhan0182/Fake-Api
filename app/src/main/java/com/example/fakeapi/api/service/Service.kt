package com.example.fakeapi.api.service
import com.example.fakeapi.api.Model
import retrofit2.http.GET

interface Service {

     @GET("users")

    suspend fun Getdata():List<Model>

}