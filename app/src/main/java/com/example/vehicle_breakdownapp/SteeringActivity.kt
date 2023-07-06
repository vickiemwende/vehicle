package com.example.vehicle_breakdownapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class SteeringActivity : AppCompatActivity() {

    lateinit var str: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_steering)

        str = findViewById(R.id.mSter)
        val webSettings = str.settings
        webSettings.javaScriptEnabled = true
        str.loadUrl("https://www.budgetautorepair.com/services/power-steering-repair-and-maintenance/")



    }
}