package com.test.myapplication.ui

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
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
        btnSeven.setOnClickListener(this)
        ivTelp.setOnClickListener {
            val phoneNumber = etTelp.text.toString()  //tinggal ubah aja disini
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse("tel:$phoneNumber")))
        }
        checkPermission()

    }

    override fun onClick(view: View?) {
        when (view) {
            btnOne -> {
                startActivity(Intent(this@MainActivity, BarVolumeActivity::class.java))
            }

            btnTwo -> {
                val moveWithDataIntent = Intent(this@MainActivity, CarryDataActivity::class.java)
                moveWithDataIntent.putExtra(CarryDataActivity.EXTRA_NAME, "DicodingAcademy Boy")
                moveWithDataIntent.putExtra(CarryDataActivity.EXTRA_AGE, 5)
                startActivity(moveWithDataIntent)
            }

            btnThree -> {
                val phoneNumber = "085716163447"
//                startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber")))
                val intent = Intent(Intent.ACTION_CALL)
                intent.data = Uri.parse("tel:$phoneNumber")
                startActivity(intent)
            }

            btnFour -> {
                startActivity(Intent(this@MainActivity, ViewAndViewsActivity::class.java))
            }

            btnFive -> {
                startActivity(Intent(this@MainActivity, RecyclerViewActivity::class.java))
            }

            btnSix -> {
                Toast.makeText(this, btnSix.text.toString(), Toast.LENGTH_SHORT).show()
            }

            btnSeven -> {
                startActivity(Intent(this@MainActivity, NewTestActivity::class.java))
            }

//            ivTelp -> {
//                val phoneNumber = etTelp.text.toString()
//                startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber")))
//            }
        }
    }

    fun checkPermission() {
        if (ContextCompat.checkSelfPermission(
                this, Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            //Can add more as per requirement
            ActivityCompat.requestPermissions(
                this, arrayOf(
                    Manifest.permission.CALL_PHONE
                ), 123
            )
        }
    }
}