package com.test.myapplication.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.test.myapplication.R
import kotlinx.android.synthetic.main.activity_carry_data.*

class CarryDataActivity : AppCompatActivity() {
    companion object {
        private val TAG: String = CarryDataActivity::class.java.simpleName
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carry_data)
        supportActionBar?.title = "Carry Data"

        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)

        val text = "Name : $name, \nYour Age : $age"
        Log.d(TAG, "onCreate: text: $text")
        tvDataReceived.text = text

    }
}