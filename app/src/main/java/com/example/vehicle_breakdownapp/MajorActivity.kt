package com.example.vehicle_breakdownapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MajorActivity : AppCompatActivity() {

    lateinit var maj: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_majour)

        maj = findViewById(R.id.btnbackmajor)


        maj.setOnClickListener {

            var gotoLessFortunate = Intent(this, HomeActivity::class.java )
            startActivity(gotoLessFortunate)

        }

    }
}