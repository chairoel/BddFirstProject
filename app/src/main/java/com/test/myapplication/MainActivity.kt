package com.test.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOne.setOnClickListener {
            Toast.makeText(this, "Button One", Toast.LENGTH_SHORT).show()
        }

        btnTwo.setOnClickListener {
            Toast.makeText(this, "Button Two", Toast.LENGTH_SHORT).show()
        }

        btnThree.setOnClickListener {
            Toast.makeText(this, "Button Three", Toast.LENGTH_SHORT).show()
        }

        btnFour.setOnClickListener {
            Toast.makeText(this, "Button Four", Toast.LENGTH_SHORT).show()
        }

        btnFive.setOnClickListener {
            Toast.makeText(this, "Button Five", Toast.LENGTH_SHORT).show()
        }

        btnSix.setOnClickListener {
            Toast.makeText(this, "Button Six", Toast.LENGTH_SHORT).show()
        }
    }
}