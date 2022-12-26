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

class NewListAdapter(private var listHero: ArrayList<Hero>) :
    RecyclerView.Adapter<NewListAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_hero, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hero = listHero[position]

        holder.tvName.text = hero.name

        holder.tvDetail.text = hero.detail

        Glide.with(holder.itemView.context)
            .load(hero.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
    }

    override fun getItemCount(): Int {
        return listHero.size
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tvItemName)
        var tvDetail: TextView = itemView.findViewById(R.id.tvItemDetail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.imgItemPhoto)
    }

}