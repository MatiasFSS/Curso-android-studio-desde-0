package com.copetiny.androidmaster.superheroapp

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import com.copetiny.androidmaster.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperheroViewHolder (view:View):RecyclerView.ViewHolder(view){

    private val binding = ItemSuperheroBinding.bind(view)

    fun bind (superheroItemResponse:SuperheroItemResponse, onItemSelected:(String) -> Unit){
        binding.tvSuperheroName.text = superheroItemResponse.name
        Picasso.get().load(superheroItemResponse.SuperheroImage.url).into(binding.ivSuperhero)
        binding.root.setOnClickListener { onItemSelected(superheroItemResponse.superheroId) }
    }

}