package com.example.vehicle_breakdownapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class PunctureActivity : AppCompatActivity() {

    lateinit var paint:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puncture)

        paint = findViewById(R.id.mPun)
        val webSettings = paint.settings
        webSettings.javaScriptEnabled = true
        paint.loadUrl("https://www.google.com/search?client=firefox-b-lm&sxsrf=APwXEddUFABMfYljRk479DsBDJxcfpTo1w:1684266418796&q=Documentaries+photos+of+tyre+puncture+repair&tbm=isch&source=univ&fir=VJ4sWQXNtYnJgM%252Cc9ywp-l39KPfrM%252C_%253BbP_CKAukiS8tXM%252CHkMIic-074M3_M%252C_%253BJ-B7S_gINWKQwM%252CnyWKNj_CwHjrqM%252C_%253Bl6i_4wdz84jdsM%252Cbfe_9b_FY1cPkM%252C_%253BTyG-EzVFkkxXOM%252Cc9ywp-l39KPfrM%252C_%253BPC4FvnNH66ygeM%252CRokKcVRSMb8oFM%252C_%253BmcyZmu26yGwkgM%252Cua9XMDlSTIqaRM%252C_%253BpINJtPsgnheJAM%252CltShSDBQKuMsLM%252C_%253BifFUh8pZymPcTM%252C12CVn8_XwVNNeM%252C_%253B_5uOf8GOxpp38M%252CltShSDBQKuMsLM%252C_&usg=AI4_-kT2BtJwzV5tVqkKMGI-6TxqfNpU8Q&sa=X&ved=2ahUKEwj4ruWszfr-AhWBu6QKHWkoAYMQ7Al6BAgdEEo")


    }
}