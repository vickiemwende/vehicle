package com.example.vehicle_breakdownapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class PaintingActivity : AppCompatActivity() {

    lateinit var paint:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_painting)

        paint = findViewById(R.id.mPaint)
        val webSettings = paint.settings
        webSettings.javaScriptEnabled = true
        paint.loadUrl("https://www.google.com/search?client=firefox-b-lm&sxsrf=APwXEdeo1RR8vxs3Ua7PGKvCOb-NXOSAsQ:1684266513732&q=Documentaries+car+body+paint&tbm=isch&source=univ&fir=O5wFPtdpG8DzCM%252C3BP6h64B0-pafM%252C_%253BqtqgokW8HqBQZM%252CgEsDybiUUBdqAM%252C_%253BxbJFT4qQw6zIwM%252Chugl_9x6K_FVnM%252C_%253B5qFaFaceuKKiCM%252CgDmvAohU20l9JM%252C_%253BOSVEdPKB8mF8sM%252Ce97nrselEadLcM%252C_%253BXFpcgqlkM7abCM%252CdTnRuiFBA5mHWM%252C_%253BFBQuMw0uXh5oFM%252Cgo5H7jjM5qAaDM%252C_%253B9kxQSY_SFUg9nM%252CguRHp-3yi6OiEM%252C_%253Ba_vCfWq9PQ7_NM%252C4fnaQKmyuHYrfM%252C_%253B5gSmVpXxE4HHIM%252C4q5eBcn_vO7IuM%252C_&usg=AI4_-kQRZFwgVDRpAFt0AJY_sK5dXlVAMA&sa=X&ved=2ahUKEwiV64fazfr-AhUOHewKHdtzDxUQ7Al6BAgZEEc")


    }
}