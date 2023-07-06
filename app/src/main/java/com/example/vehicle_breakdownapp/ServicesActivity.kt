package com.example.vehicle_breakdownapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class ServicesActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services)

        val exit = findViewById<CardView>(R.id.cardfdback)
        exit.setOnClickListener {
            startActivity(
                Intent(
                    this@ServicesActivity,
                    MainActivity::class.java
                )
            )
        }

        val familyphysician = findViewById<CardView>(R.id.cardfdfamilyphysician)
        familyphysician.setOnClickListener {
            val it = Intent(this@ServicesActivity, EngineRepairActivity::class.java)
            it.putExtra("title", "Family Physicians")
            startActivity(it)
        }

        val dietician = findViewById<CardView>(R.id.cardfddietician)
        dietician.setOnClickListener {
            val it = Intent(this@ServicesActivity, CoolingActivity::class.java)
            it.putExtra("title", "Dietician")
            startActivity(it)
        }
        val dentist = findViewById<CardView>(R.id.cardfddentist)
        dentist.setOnClickListener {
            val it = Intent(this@ServicesActivity, OilChangeActivity::class.java)
            it.putExtra("title", "Dentist")
            startActivity(it)
        }
        val surgeon = findViewById<CardView>(R.id.cardfdsurgeon)
        surgeon.setOnClickListener {
            val it = Intent(this@ServicesActivity,PunctureActivity::class.java)
            it.putExtra("title", "Surgeon")
            startActivity(it)
        }
        val cardiologist = findViewById<CardView>(R.id.cardfdcardiologist)
        cardiologist.setOnClickListener {
            val it = Intent(this@ServicesActivity, PaintingActivity::class.java)
            it.putExtra("title", "Cardiologist")
            startActivity(it)
        }
    }
}

