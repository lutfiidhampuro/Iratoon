package com.example.iratoon.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.iratoon.model.AnimeDetail
import com.example.iratoon.R
import com.example.iratoon.model.AnimeTerbaru

class AnimeTerbaruAdapter(private val animeterbarulist: List<AnimeTerbaru>): RecyclerView.Adapter<AnimeTerbaruAdapter.ViewHolder>() {

    class ViewHolder(itemview : View): RecyclerView.ViewHolder(itemview){
        val tvTitle = itemview.findViewById<TextView>(R.id.tvTitle)
        val tvEpisode = itemview.findViewById<TextView>(R.id.tvEpisode)
        val tvRating = itemview.findViewById<TextView>(R.id.tvRate)
        val img = itemview.findViewById<ImageView>(R.id.imgImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_animeterbaru,parent,false)
        return ViewHolder (view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val anime = animeterbarulist[position]
        holder.tvTitle.text = anime.titleTerbaru
        holder.tvEpisode.text = anime.episodeTerbaru
        holder.tvRating.text = anime.ratingTerbaru

        Glide.with(holder.itemView.context)
            .load(anime.imgTerbaru)
            .into(holder.img)
    }

    override fun getItemCount(): Int {
        return animeterbarulist.size
    }
}