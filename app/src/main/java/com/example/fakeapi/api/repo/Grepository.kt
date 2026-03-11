package com.example.fakeapi.api.repo

import com.example.fakeapi.api.Model
import com.example.fakeapi.api.Retrofitclient

class Grepository {

    val apiclient = Retrofitclient.api

   suspend fun getuserdata() = apiclient.Getdata()



}