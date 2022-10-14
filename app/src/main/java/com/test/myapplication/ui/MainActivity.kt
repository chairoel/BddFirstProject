package com.test.myapplication.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.test.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOne.setOnClickListener(this)
        btnTwo.setOnClickListener(this)
        btnThree.setOnClickListener(this)
        btnFour.setOnClickListener(this)
        btnFive.setOnClickListener(this)
        btnSix.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view) {
            btnOne -> {
                startActivity(Intent(this@MainActivity, BarVolume::class.java))
            }

            btnTwo -> {
                Toast.makeText(this, btnTwo.text.toString(), Toast.LENGTH_SHORT).show()
            }

            btnThree -> {
                Toast.makeText(this, btnThree.text.toString(), Toast.LENGTH_SHORT).show()
            }

            btnFour -> {
                Toast.makeText(this, btnFour.text.toString(), Toast.LENGTH_SHORT).show()
            }

            btnFive -> {
                Toast.makeText(this, btnFive.text.toString(), Toast.LENGTH_SHORT).show()
            }

            btnSix -> {
                Toast.makeText(this, btnSix.text.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}