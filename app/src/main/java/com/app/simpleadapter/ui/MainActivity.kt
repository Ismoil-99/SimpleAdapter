package com.app.simpleadapter.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.app.simpleadapter.ui.adapter.EpoxyItemsController
import com.app.simpleadapter.R
import com.app.simpleadapter.data.Items
import com.app.simpleadapter.data.ItemsHeader
import com.app.simpleadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val clubs = listOf(
            Items(0, "Arsenal", R.drawable.arsenal),
            Items(1, "Chelsea", R.drawable.chelsea),
            Items(2, "Liverpool", R.drawable.liverpool),
            Items(3, "Manchester United", R.drawable.manchester_united),
            Items(4, "Manchester City", R.drawable.manchester_city),
            Items(5, "Barcelona", R.drawable.barcelona),
            Items(6, "Real Madrid", R.drawable.real_madrid),
            Items(7, "Valencia", R.drawable.valencia),
            Items(8, "Athletic Madrid", R.drawable.atletico_madrid),
            Items(9, "Athletic Bilbao", R.drawable.athletic_bilbao),
        )
        val player = listOf(
            Items(0, "Messi", R.drawable.messi_icons),
            Items(1, "Ronaldo", R.drawable.ronaldo_icons),
            Items(2, "Lewandowski", R.drawable.lewandowski_icons),
            Items(3, "Mbappe", R.drawable.mbappe_icons),
            Items(4, "Neymar", R.drawable.neymar_icons),
            Items(5, "Cavani", R.drawable.cavani_icons),
            Items(6, "Ozil", R.drawable.ozil_icons),
        )
        val headers = listOf(
            ItemsHeader(0,"Clubs", R.drawable.football_club),
            ItemsHeader(1,"Players", R.drawable.football_player)
        )
        setupAdapter(clubs,headers,player)
    }

    private fun setupAdapter(clubs: List<Items>,headers: List<ItemsHeader>,player: List<Items>) {
        val epoxyController = EpoxyItemsController { item ->
            Log.d("value", "$item")
        }
        binding.epoxyModel.setController(epoxyController)
        epoxyController.apply {
            club = clubs
            header = headers
            players = player
        }
    }
}