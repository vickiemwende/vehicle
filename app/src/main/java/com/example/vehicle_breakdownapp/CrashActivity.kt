package com.example.vehicle_breakdownapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class CrashActivity : AppCompatActivity() {
    lateinit var crash: WebView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crash2)
       crash = findViewById(R.id.mCrash)
        val webSettings = crash.settings
        webSettings.javaScriptEnabled = true
        crash.loadUrl("https://keycollisioncenter.com/car-accident-repair/")

    }
}