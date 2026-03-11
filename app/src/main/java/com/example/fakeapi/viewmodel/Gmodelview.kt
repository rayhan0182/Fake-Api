package com.example.fakeapi.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fakeapi.api.Model
import com.example.fakeapi.api.modeldata.Pmodel
import com.example.fakeapi.api.repo.Grepository
import kotlinx.coroutines.launch
import okhttp3.Response

class Gmodelview: ViewModel() {

    private val _respons = MutableLiveData<List<Model>>()

     val respons: LiveData<List<Model>> = _respons

    private val _uploadrespons = MutableLiveData<String>()

    val uploadrespons: LiveData<String> = _uploadrespons

    val errorrespons = MutableLiveData<String>()

    private val repo = Grepository()

    fun createuserdata() {
        viewModelScope.launch {

            try {

                val data = repo.getuserdata()

                _respons.postValue(data)

            } catch (e: Exception) {

                errorrespons.postValue(e.message.toString())

            }
        }

    }

        fun userdata(pmodel: Pmodel){

            viewModelScope.launch {

                try {

                    val datauser = repo.repocreate(pmodel)

                    if (datauser.isSuccess){

                        _uploadrespons.postValue("successfully created")

                    }else{

                        _uploadrespons.postValue("failed")
                    }

                }catch (e: Exception){

                    errorrespons.postValue(e.message.toString())

                }
            }

        }

}