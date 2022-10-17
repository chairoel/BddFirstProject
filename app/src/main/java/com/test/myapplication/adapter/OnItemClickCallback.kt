package com.test.myapplication.adapter

import com.test.myapplication.data.Hero

interface OnItemClickCallback {
    fun onItemClicked(data: Hero)
}