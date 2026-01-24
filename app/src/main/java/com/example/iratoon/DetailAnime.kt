package com.example.iratoon

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class DetailAnime : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_anime)
        val tvTitle = findViewById<TextView>(R.id.tvTitle)
        val tvRating = findViewById<TextView>(R.id.tvRate)
        val tvSinopsis = findViewById<TextView>(R.id.tvSinopsis)
        val tvGenre = findViewById<TextView>(R.id.tvGenre)
        val img = findViewById<ImageView>(R.id.imgImage)

        tvTitle.text = intent.getStringExtra("title")
        tvRating.text = intent.getStringExtra("rating")
        tvSinopsis.text = intent.getStringExtra("sinopsis")
        tvGenre.text = intent.getStringExtra("genre")
        val imageRes = intent.getIntExtra("image",0)

        Glide.with(this)
            .load(imageRes)
            .into(img)

        val btnBack = findViewById<ImageView>(R.id.backButton)
        btnBack.setOnClickListener {
            finish()
        }


    }
}