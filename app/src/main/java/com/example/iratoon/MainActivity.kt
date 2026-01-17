package com.example.iratoon

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.iratoon.R
import com.example.iratoon.adapter.AnimeAdapter
import com.example.iratoon.adapter.AnimeTerbaruAdapter
import com.example.iratoon.data.AnimeDummyData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recyclerviewpopular = findViewById<RecyclerView>(R.id.rvPopular)
        recyclerviewpopular.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        val recyclerviewterbaru = findViewById<RecyclerView>(R.id.rvTerbaru)
        recyclerviewterbaru.layoutManager = GridLayoutManager(this, 3)
        val adapterTerbaru = AnimeTerbaruAdapter(AnimeDummyData.animeTerbaru)
        recyclerviewterbaru.adapter = adapterTerbaru
        val adapterPopular = AnimeAdapter(AnimeDummyData.animePopular)
        recyclerviewpopular.adapter = adapterPopular
    }
}