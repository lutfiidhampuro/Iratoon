package com.example.iratoon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.iratoon.R
import com.example.iratoon.adapter.AnimeAdapter
import com.example.iratoon.adapter.AnimeTerbaruAdapter
import com.example.iratoon.data.AnimeDummyData

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerviewpopular = view.findViewById<RecyclerView>(R.id.rvPopular)
        recyclerviewpopular.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL,false)
        val recyclerviewterbaru = view.findViewById<RecyclerView>(R.id.rvTerbaru)
        recyclerviewterbaru.layoutManager = GridLayoutManager(requireContext(), 3)
        val adapterTerbaru = AnimeTerbaruAdapter(AnimeDummyData.animeTerbaru)
        recyclerviewterbaru.adapter = adapterTerbaru
        val adapterPopular = AnimeAdapter(AnimeDummyData.animePopular)
        recyclerviewpopular.adapter = adapterPopular

        recyclerviewpopular.isNestedScrollingEnabled = false
        recyclerviewterbaru.isNestedScrollingEnabled = false
        }
    }
