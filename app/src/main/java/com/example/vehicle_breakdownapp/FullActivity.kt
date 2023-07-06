package com.example.vehicle_breakdownapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FullActivity : AppCompatActivity() {

    lateinit var full: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full)

        full = findViewById(R.id.btnbackfull)


        full.setOnClickListener {

            var gotoLessFortunate = Intent(this, HomeActivity::class.java )
            startActivity(gotoLessFortunate)

        }


    }
}