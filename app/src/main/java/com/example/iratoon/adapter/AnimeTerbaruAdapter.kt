package com.example.iratoon.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.iratoon.DetailAnime
import com.example.iratoon.model.AnimeDetail
import com.example.iratoon.R

class AnimeTerbaruAdapter(private val animeterbarulist: List<AnimeDetail>): RecyclerView.Adapter<AnimeTerbaruAdapter.ViewHolder>() {

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
        holder.tvTitle.text = anime.title
        holder.tvEpisode.text = anime.episode
        holder.tvRating.text = anime.rating

        Glide.with(holder.itemView.context)
            .load(anime.image)
            .into(holder.img)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailAnime :: class.java)
            intent.putExtra("title",anime.title)
            intent.putExtra("episode",anime.episode)
            intent.putExtra("rating",anime.rating)
            intent.putExtra("sinopsis",anime.sinopsis)
            intent.putExtra("genre",anime.genre)
            intent.putExtra("image", anime.image)

            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return animeterbarulist.size
    }
}