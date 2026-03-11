package com.example.fakeapi.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fakeapi.api.Model
import com.example.fakeapi.api.repo.Grepository
import kotlinx.coroutines.launch

class Gmodelview: ViewModel() {

    private val _respons = MutableLiveData<List<Model>>()

     val respons: LiveData<List<Model>> = _respons

    val errorrespons = MutableLiveData<String>()

    private val repo = Grepository()

    fun createuserdata(){


        viewModelScope.launch {

            try {

                val data = repo.getuserdata()

                _respons.postValue(data)

            }catch (e: Exception){

                errorrespons.postValue(e.message.toString())

            }


        }



    }


}