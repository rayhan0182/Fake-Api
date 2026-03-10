package com.example.fakeapi.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fakeapi.api.Model
import com.example.fakeapi.databinding.BiolistuserBinding

class Adapter(val ulist: List<Model>): RecyclerView.Adapter<Adapter.Viewholder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Viewholder {

        val bind = BiolistuserBinding.inflate(LayoutInflater.from(parent.context),parent,false)

      return  Viewholder(bind)

    }

    override fun onBindViewHolder(
        holder: Viewholder,
        position: Int
    ) {

         val datauser = ulist[position]

        holder.binding.let {




        }


    }

    override fun getItemCount(): Int {

      return  ulist.size

    }


    class Viewholder(val binding: BiolistuserBinding): RecyclerView.ViewHolder(binding.root)
}