package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecycleAdapter(private val cloths:MutableList<Object>) :
    RecyclerView.Adapter<MyRecycleAdapter.UserViewHolder>(){

    class UserViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){
        val imageIV:ImageView = itemView.findViewById(R.id.imageIV)
        val nameTextView:TextView = itemView.findViewById(R.id.nameTV)
        val ageTextView:TextView = itemView.findViewById(R.id.descriptionTV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent,false)
        return UserViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val cloth = cloths[position]
        holder.imageIV.setImageResource(cloth.image)
        holder.nameTextView.text = cloth.name
        holder.ageTextView.text = cloth.description
    }

    override fun getItemCount() = cloths.size

}