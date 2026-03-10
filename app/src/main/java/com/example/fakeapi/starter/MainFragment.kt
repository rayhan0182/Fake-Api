package com.example.fakeapi.starter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fakeapi.R
import com.example.fakeapi.basefrag.BaseFragment
import com.example.fakeapi.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>(

    FragmentMainBinding::inflate


) {

    override fun createuser() {

        binding.animationView.playAnimation()

        binding.showlist.setOnClickListener {

            findNavController().navigate(R.id.action_mainFragment_to_userlistFragment)

        }

        binding.createuser.setOnClickListener {

            findNavController().navigate(R.id.action_mainFragment_to_uploadFragment)
        }



    }

    override fun responsuser() {

    }




}