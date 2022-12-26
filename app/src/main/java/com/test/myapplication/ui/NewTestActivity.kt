package com.test.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.test.myapplication.R
import com.test.myapplication.adapter.ListHeroAdapter
import com.test.myapplication.data.Hero
import com.test.myapplication.data.HeroesData
import kotlinx.android.synthetic.main.activity_new_test.*

class NewTestActivity : AppCompatActivity() {
    private var list: ArrayList<Hero> = arrayListOf()
//    private val listHeroAdapter: ListHeroAdapter = ListHeroAdapter(ArrayList())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_test)
        supportActionBar?.title = "New RecyclerView"

        rvHeroesNew.setHasFixedSize(true)
        list = HeroesData.listData
        rvHeroesNew.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListHeroAdapter(list)
        rvHeroesNew.adapter = listHeroAdapter
    }
}