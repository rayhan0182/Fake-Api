package com.example.fakeapi.api.service
import com.example.fakeapi.api.Model
import com.example.fakeapi.api.modeldata.Pmodel
import okhttp3.internal.concurrent.Task
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface Service {

     @GET("users")

    suspend fun getdata():List<Model>

    @POST("posts")

    suspend fun createdata(@Body pmodel: Pmodel): Result<Boolean>

}