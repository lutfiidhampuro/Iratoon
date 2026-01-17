package com.example.iratoon.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.iratoon.model.AnimeDetail
import com.example.iratoon.R
import com.bumptech.glide.Glide

class AnimeAdapter(private val animeList: List<AnimeDetail>): RecyclerView.Adapter<AnimeAdapter.ViewHolder>() {

    class ViewHolder(itemview: View): RecyclerView.ViewHolder(itemview){
    val tvTitle =itemview.findViewById<TextView>(R.id.tvTitle)
    val img = itemview.findViewById<ImageView>(R.id.imgImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_animepopular,parent,false)
        return ViewHolder (view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val anime = animeList[position]
        holder.tvTitle.text = anime.title

        Glide.with(holder.itemView.context)
            .load(anime.image)
            .into(holder.img)

    }

    override fun getItemCount(): Int {
        return animeList.size
    }
}