package com.example.fakeapi.adapter
import android.annotation.SuppressLint
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

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(
        holder: Viewholder,
        position: Int
    ) {

         val datauser = ulist[position]

        holder.binding.let {

            datauser.apply {

                it.name.text = "Name:${name}"

                it.uname.text = "User Name:${username}"

                it.email.text = "Email:${email}"

                it.street.text = "Street:${address.street}"

                it.suite.text = "Suite:${address.suite}"

                it.city.text = "City:${address.city}"

                it.zipcode.text = "Zipcode:${address.zipcode}"

                it.lat.text = "lat:${address.geo.lat}"

                it.lng.text = "lng:${address.geo.lng}"

            }
        }
    }

    override fun getItemCount(): Int = ulist.size

  inner  class Viewholder(val binding: BiolistuserBinding): RecyclerView.ViewHolder(binding.root)
}