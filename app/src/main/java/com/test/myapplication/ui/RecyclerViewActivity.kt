package com.test.myapplication.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.test.myapplication.R

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        supportActionBar?.title = "Recycler View"

    }
}