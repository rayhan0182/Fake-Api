package com.example.fakeapi.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.fakeapi.R
import com.example.fakeapi.api.modeldata.Pmodel
import com.example.fakeapi.basefrag.BaseFragment
import com.example.fakeapi.databinding.FragmentUploadBinding
import com.example.fakeapi.emptyis
import com.example.fakeapi.textwith
import com.example.fakeapi.viewmodel.Gmodelview

class UploadFragment : BaseFragment<FragmentUploadBinding>(

    FragmentUploadBinding::inflate

) {

    lateinit var gmodelview: Gmodelview

    override fun createuser() {

        gmodelview = ViewModelProvider(requireActivity())[Gmodelview::class.java]

        with(binding) {

            clickBtn.setOnClickListener {

                userid.emptyis()

                titleA.emptyis()

                writetext.emptyis()

                if (!userid.emptyis() && !titleA.emptyis() && !writetext.emptyis()) {

                    val titletext = titleA.textwith()

                    val body = writetext.textwith()

                    val userid = userid.textwith().toInt()

                    val duser = Pmodel(1, titletext, body, userid)

                    gmodelview.userdata(duser)

                    usercreaterespons()

                }
            }

        }
    }

    fun usercreaterespons() {

        gmodelview.uploadrespons.observe(this){it->

            Toast.makeText(requireContext(),"Success:$it", Toast.LENGTH_LONG).show()

        }
        gmodelview.errorrespons.observe(this){it->

            Toast.makeText(requireContext(),"error:$it", Toast.LENGTH_LONG).show()

        }
    }

    override fun responsuser() {}
}