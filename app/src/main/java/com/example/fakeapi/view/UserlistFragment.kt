package com.example.fakeapi.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.fakeapi.R
import com.example.fakeapi.adapter.Adapter
import com.example.fakeapi.basefrag.BaseFragment
import com.example.fakeapi.databinding.FragmentUserlistBinding
import com.example.fakeapi.viewmodel.Gmodelview

class UserlistFragment : BaseFragment<FragmentUserlistBinding>(

    FragmentUserlistBinding::inflate)
 {

    lateinit var gmodelview: Gmodelview

    lateinit var adapter: Adapter


    override fun createuser() {

        gmodelview = ViewModelProvider(requireActivity())[Gmodelview::class.java]

        gmodelview.createuserdata()

    }

    override fun responsuser() {

        gmodelview.respons.observe(this){it->


            adapter = Adapter(it)

            binding.rc.adapter = adapter
        }

        gmodelview.errorrespons.observe(this){it->

            Toast.makeText(requireContext(),"$it", Toast.LENGTH_LONG).show()

        }



    }

}