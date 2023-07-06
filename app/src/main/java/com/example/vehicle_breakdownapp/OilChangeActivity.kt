package com.example.vehicle_breakdownapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class OilChangeActivity : AppCompatActivity() {

    lateinit var oil:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oil_change)

        oil = findViewById(R.id.mOil)
        val webSettings = oil.settings
        webSettings.javaScriptEnabled = true
        oil.loadUrl("https://www.google.com/search?client=firefox-b-lm&sxsrf=APwXEdeqsMMwIcHw82XTLL_zYjpw0Q99Zg:1684266326032&q=Documentaries+photos+of+oil+change+in+vehicles&tbm=isch&source=univ&fir=Iggj7wzNSFhEcM%252CyEADP5OJ8DupzM%252C_%253Bj43o1uoYtB84XM%252CMUf7B7ZU5z6aKM%252C_%253BH-IJ07-CDpymLM%252CyEADP5OJ8DupzM%252C_%253Bpa1KCwV45PEPLM%252CYZTde04xSTu65M%252C_%253B3lshbe3lQOBTMM%252CYZTde04xSTu65M%252C_%253B2_7dGKz4xBFvDM%252Ci0Tb0PHBf87fmM%252C_%253BQ1Pzqi3TqBo0MM%252CDATTU67zfjEOlM%252C_%253Bt4mxUJK64SZ0RM%252CxxMXCtQEVr9ToM%252C_%253BLsy16ZW7JiQpuM%252Cboeb34h13AegKM%252C_%253BaO17rk7R_MOgUM%252CDATTU67zfjEOlM%252C_&usg=AI4_-kQ7-0UIo9SoTxbcYRU2mIfqIkhtyg&sa=X&ved=2ahUKEwjk08eAzfr-AhWEjKQKHWI8DYgQ7Al6BAgYEFc")


    }
}