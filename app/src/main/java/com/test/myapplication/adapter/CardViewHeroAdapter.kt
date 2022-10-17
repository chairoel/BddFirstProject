package com.test.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.test.myapplication.R
import com.test.myapplication.data.Hero

class CardViewHeroAdapter(
    private var listHero: ArrayList<Hero>
) : RecyclerView.Adapter<CardViewHeroAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_hero, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val context: Context = holder.itemView.context
        val hero = listHero[position]

        Glide.with(holder.itemView.context)
            .load(hero.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.tvName.text = hero.name
        holder.tvDetail.text = hero.detail

        holder.btnFavorite.setOnClickListener {
            Toast.makeText(context, "Favorite " + listHero[position].name, Toast.LENGTH_SHORT).show()
        }

        holder.btnShare.setOnClickListener {
            Toast.makeText(context, "Share " + listHero[position].name, Toast.LENGTH_SHORT).show()
        }

        holder.itemView.setOnClickListener {
            Toast.makeText(context, "Kamu memilih " + listHero[position].name, Toast.LENGTH_SHORT).show()
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

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.imgItemPhoto)
        var tvName: TextView = itemView.findViewById(R.id.tvItemName)
        var tvDetail: TextView = itemView.findViewById(R.id.tvItemDetail)
        var btnFavorite: Button = itemView.findViewById(R.id.btnSetFavorite)
        var btnShare: Button = itemView.findViewById(R.id.btnSetShare)
    }
}