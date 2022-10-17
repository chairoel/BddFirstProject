package com.test.myapplication.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.test.myapplication.R
import com.test.myapplication.adapter.ListHeroAdapter
import com.test.myapplication.data.Hero
import com.test.myapplication.data.HeroesData
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    private var list: ArrayList<Hero> = arrayListOf()
    private val listHeroAdapter: ListHeroAdapter = ListHeroAdapter(ArrayList())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        supportActionBar?.title = "Recycler View"

        rvHeroes.setHasFixedSize(true)
        list = HeroesData.listData
        showRecyclerList(list)
    }

    private fun showRecyclerList(data: List<Hero>) {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        rvHeroes.adapter = listHeroAdapter
        listHeroAdapter.setItems(data)
    }
}