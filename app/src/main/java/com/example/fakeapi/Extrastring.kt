package com.example.fakeapi

import android.widget.EditText
import android.widget.TextView

fun EditText.emptyis(): Boolean{

   return if (this.text.isEmpty()){

        error = "please enter the value"

       true

    }else{

        false

    }



}

fun TextView.textwith(): String{

   return this.text.toString()

}