package com.example.iratoon

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.iratoon.R
import com.example.iratoon.adapter.AnimeAdapter
import com.example.iratoon.adapter.AnimeTerbaruAdapter
import com.example.iratoon.data.AnimeDummyData
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val NavHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = NavHostFragment.navController

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav_menu)
        bottomNavigationView.setupWithNavController(navController)

        bottomNavigationView.setOnNavigationItemSelectedListener{
            when (it.itemId){
                R.id.home_menu -> {
                    navController.navigate(R.id.home_navigation)
                    true
                }

                R.id.popular_menu -> {
                    navController.navigate(R.id.popular_navigation)
                    true
                }

                R.id.terbaru_menu -> {
                    navController.navigate(R.id.terbaru_navigation)
                    true
                }

                else -> false
            }
        }

    }
}