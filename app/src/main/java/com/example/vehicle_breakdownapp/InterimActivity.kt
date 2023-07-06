package com.example.vehicle_breakdownapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InterimActivity : AppCompatActivity() {

    lateinit var interim: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interim)

        interim = findViewById(R.id.btnbackinterim)


        interim.setOnClickListener {

            var gotoLessFortunate = Intent(this, HomeActivity::class.java )
            startActivity(gotoLessFortunate)

        }

    }
}