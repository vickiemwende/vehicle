package com.example.vehicle_breakdownapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class EngineRepairActivity : AppCompatActivity() {

    lateinit var engine:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_engine_repair)

        engine = findViewById(R.id.mEngine)
        val webSettings = engine.settings
        webSettings.javaScriptEnabled = true
       engine.loadUrl("https://www.google.com/search?client=firefox-b-lm&sxsrf=APwXEdcRGf3EnXkjmnwtnuSTs-a5pQT2uQ:1684266704412&q=documentaries+car+engine+repair&tbm=isch&source=univ&fir=K-Wr16mOzrPmDM%252CB1vFvcKt4eLgqM%252C_%253BQM7jLvaOKSR9SM%252CRyFSIQd2vK-v2M%252C_%253Bh2efXyMXhZG_vM%252CeoL6ypT60JjFKM%252C_%253BCacS5xwHTzRJcM%252C4m8wETQubJSLxM%252C_%253BMzwUrWafukf6SM%252CAMeA5kYcBTzCAM%252C_%253BBwDPvgPeuxlxeM%252CGFHQEl5SJTGyIM%252C_%253BWPjLzihU6L9S3M%252CyB1iED4mNxqiMM%252C_%253BfzLRyVhWycE-bM%252CQWit4nDtCAOVZM%252C_%253BeLEqMbfiXqG6wM%252C3_8yIbMv1laJpM%252C_%253BzlHPpGt6AAJrjM%252CB1vFvcKt4eLgqM%252C_&usg=AI4_-kQUiVauVnn-Q7mVaAbg7v3XoSe1VA&sa=X&ved=2ahUKEwjklv60zvr-AhXKzqQKHTieDwsQ7Al6BAhUEFU")


    }
}