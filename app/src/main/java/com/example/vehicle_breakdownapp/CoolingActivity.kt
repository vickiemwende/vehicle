package com.example.vehicle_breakdownapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class CoolingActivity: AppCompatActivity() {

    lateinit var cool: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cooling)

        cool = findViewById(R.id.mCool)
        val webSettings = cool.settings
        webSettings.javaScriptEnabled = true
        cool.loadUrl("https://www.google.com/search?client=firefox-b-lm&sxsrf=APwXEddGlaBSjf8rOpumH9kyIA-XoFLcaQ:1684265970658&q=Documentaries+photos+of+cooling+system+repair&tbm=isch&source=univ&fir=xw2GW5f-iKBfCM%252CWfT3C2hwrdVqWM%252C_%253BRX6rfZnlB41xaM%252CCiCaujtKw4NpUM%252C_%253B5yGnIs6iyi5FjM%252ClLY6v_lBetUsnM%252C_%253BUv5gz_DBGy3Y3M%252CmvTOEtNuDJGKGM%252C_%253BkYRAaAO_ZzK0YM%252C1rg7Xo4nwnygvM%252C_%253BRwmff_ha2fj41M%252Cs9b_Xffk3OdmiM%252C_%253BhgWqlzn6jJGY-M%252CUqdpV0NRO4dCJM%252C_%253BiyLHWa3UkJ5wMM%252C9VLeczp8dlVmCM%252C_%253BiNghvyA2G2KTMM%252CttH-KEas4JvvzM%252C_%253Bx6ybXaZ61fkucM%252CFSnZVb59WCUrJM%252C_&usg=AI4_-kT5lKnr6fM0z2QRpcM950mdsKAiXQ&sa=X&ved=2ahUKEwjvqY3Xy_r-AhXLhqQKHZqfAycQ7Al6BAgiEBM")


    }
}