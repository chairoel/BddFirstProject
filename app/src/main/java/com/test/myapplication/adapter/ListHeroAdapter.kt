package com.test.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.test.myapplication.R
import com.test.myapplication.data.Hero


class ListHeroAdapter(
    private var listHero: ArrayList<Hero>
) : RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_hero, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hero = listHero[position]

        Glide.with(holder.itemView.context)
            .load(hero.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = hero.name

        holder.tvDetail.text = hero.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listHero[position])
        }
    }

    override fun getItemCount(): Int {
        return listHero.size
    }

    fun getItem(index: Int): Hero {
        return listHero[index];
    }

    fun getItems(): List<Hero?> {
        return listHero
    }

    fun setItems(list: List<Hero>) {
        listHero = list as ArrayList<Hero>
        notifyDataSetChanged()
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tvItemName)
        var tvDetail: TextView = itemView.findViewById(R.id.tvItemDetail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.imgItemPhoto)
    }
}