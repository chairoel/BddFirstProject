package com.test.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.myapplication.R

class ViewAndViewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_and_views)
        supportActionBar?.title = "Google Pixel"
    }
}