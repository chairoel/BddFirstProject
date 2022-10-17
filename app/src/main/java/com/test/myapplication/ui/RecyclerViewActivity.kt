package com.test.myapplication.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.test.myapplication.R
import com.test.myapplication.adapter.CardViewHeroAdapter
import com.test.myapplication.adapter.GridHeroAdapter
import com.test.myapplication.adapter.ListHeroAdapter
import com.test.myapplication.data.Hero
import com.test.myapplication.data.HeroesData
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    private var title: String = "Recycler View"
    private var list: ArrayList<Hero> = arrayListOf()
    private val listHeroAdapter: ListHeroAdapter = ListHeroAdapter(ArrayList())
    private val gridHeroAdapter: GridHeroAdapter = GridHeroAdapter(ArrayList())
    private val cardViewHeroAdapter: CardViewHeroAdapter = CardViewHeroAdapter(ArrayList())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        setActionBarTitle(title)

        rvHeroes.setHasFixedSize(true)
        list = HeroesData.listData
        showRecyclerList(list)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList(list)
            }

            R.id.action_grid -> {
                title = "Mode Grid"
                showRecyclerGrid(list, 2)
            }

            R.id.action_cardview -> {
                title = "Mode CardView"
                showRecyclerCardView(list)
            }
        }
        setActionBarTitle(title)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showRecyclerList(data: List<Hero>) {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        rvHeroes.adapter = listHeroAdapter
        listHeroAdapter.setItems(data)
    }

    private fun showRecyclerGrid(data: List<Hero>, spanCount: Int) {
        rvHeroes.layoutManager = GridLayoutManager(this, spanCount)
        rvHeroes.adapter = gridHeroAdapter
        gridHeroAdapter.setItems(data)
    }

    private fun showRecyclerCardView(data: List<Hero>) {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        rvHeroes.adapter = cardViewHeroAdapter
        cardViewHeroAdapter.setItems(data)
    }
}