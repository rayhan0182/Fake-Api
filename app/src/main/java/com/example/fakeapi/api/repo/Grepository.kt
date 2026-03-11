package com.example.fakeapi.api.repo

import com.example.fakeapi.api.Model
import com.example.fakeapi.api.Retrofitclient
import com.example.fakeapi.api.modeldata.Pmodel
import okhttp3.Response

class Grepository {

    val apiclient = Retrofitclient.api

   suspend fun getuserdata() = apiclient.getdata()

    suspend fun repocreate(pmodel: Pmodel): Result<Boolean>{

       return apiclient.createdata(pmodel)

    }

   
}