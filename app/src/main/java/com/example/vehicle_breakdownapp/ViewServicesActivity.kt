package com.example.vehicle_breakdownapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.Button
import android.widget.ListView
import android.widget.SimpleAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.collections.ArrayList

class ViewServicesActivity : AppCompatActivity() {

    private val doctor_details1 = arrayOf(
        arrayOf(
            "Doctor Name : Emmanuel Mutuma",
            "Hospital address : Agha khan",
            "Exp : 5years",
            "Mobile No:0710550123",
            "600"
        ),
        arrayOf(
            "Doctor Name : Marcus Muturi ",
            "Hospital address : Kenyatta",
            "Exp : 15years",
            "Mobile No:0726550125",
            "800"
        ),
        arrayOf(
            "Doctor Name : Victor Mwenda",
            "Hospital address : Embu",
            "Exp : 4years",
            "Mobile No:0714550110",
            "500"
        ),
        arrayOf(
            "Doctor Name : Darliah Jayleen ",
            "Hospital address : Meru",
            "Exp : 10years",
            "Mobile No:0716550124",
            "700"
        ),
        arrayOf(
            "Doctor Name : Laura Kendi",
            "Hospital address : Karen",
            "Exp : 6years",
            "Mobile No:0716550120",
            "900"
        )
    )
    private val doctor_details2 = arrayOf(
        arrayOf(
            "Doctor Name : Emmanuel Mutuma",
            "Hospital address : Agha khan",
            "Exp : 5years",
            "Mobile No:0710550123",
            "600"
        ),
        arrayOf(
            "Doctor Name : Marcus Muturi",
            "Hospital address : Kenyatta",
            "Exp : 15years",
            "Mobile No:0726550125",
            "800"
        ),
        arrayOf(
            "Doctor Name : Victor Mutinda",
            "Hospital address : Embu",
            "Exp : 4years",
            "Mobile No:0714550110",
            "500"
        ),
        arrayOf(
            "Doctor Name : Darliah Jayleen",
            "Hospital address : Meru",
            "Exp : 10years",
            "Mobile No:0716550124",
            "700"
        ),
        arrayOf(
            "Doctor Name : Laura Kendi",
            "Hospital address : Karen",
            "Exp : 6years",
            "Mobile No:0716550120",
            "900"
        )
    )
    private val doctor_details3 = arrayOf(
        arrayOf(
            "Doctor Name : Emmanuel Mutuma",
            "Hospital address : Agha khan",
            "Exp : 5years",
            "Mobile No:0710550123",
            "600"
        ),
        arrayOf(
            "Doctor Name : Maarcus Muturi",
            "Hospital address : Kenyatta",
            "Exp : 15years",
            "Mobile No:0726550125",
            "800"
        ),
        arrayOf(
            "Doctor Name : Victor Mutinda",
            "Hospital address : Embu",
            "Exp : 4years",
            "Mobile No:0714550110",
            "500"
        ),
        arrayOf(
            "Doctor Name : Darliah Jayleen ",
            "Hospital address : Meru",
            "Exp : 10years",
            "Mobile No:0716550124",
            "700"
        ),
        arrayOf(
            "Doctor Name : Lura Kendi",
            "Hospital address : Karen",
            "Exp : 6years",
            "Mobile No:0716550120",
            "900"
        )
    )
    private val doctor_details4 = arrayOf(
        arrayOf(
            "Doctor Name : Emmanuel Mutuma",
            "Hospital address : Agha khan",
            "Exp : 5years",
            "Mobile No:0710550123",
            "600"
        ),
        arrayOf(
            "Doctor Name : Marcus Muturi ",
            "Hospital address : Kenyatta",
            "Exp : 15years",
            "Mobile No:0726550125",
            "800"
        ),
        arrayOf(
            "Doctor Name : Victor Mutinda",
            "Hospital address : Embu",
            "Exp : 4years",
            "Mobile No:0714550110",
            "500"
        ),
        arrayOf(
            "Doctor Name : Darliah Jayleen",
            "Hospital address : Meru",
            "Exp : 10years",
            "Mobile No:0716550124",
            "700"
        ),
        arrayOf(
            "Doctor Name : Laura Kendi",
            "Hospital address : Karen",
            "Exp : 6years",
            "Mobile No:0716550120",
            "900"
        )
    )
    private val doctor_details5 = arrayOf(
        arrayOf(
            "Doctor Name : Emmanuel Mutuma",
            "Hospital address : Agha khan",
            "Exp : 5years",
            "Mobile No:0710550123",
            "600"
        ),
        arrayOf(
            "Doctor Name : Marcus Muturi",
            "Hospital address : Kenyatta",
            "Exp : 15years",
            "Mobile No:0726550125",
            "800"
        ),
        arrayOf(
            "Doctor Name : Victor Mwenda",
            "Hospital address : Embu",
            "Exp : 4years",
            "Mobile No:0714550110",
            "500"
        ),
        arrayOf(
            "Doctor Name : Darliah Jayleen",
            "Hospital address : Meru",
            "Exp : 10years",
            "Mobile No:0716550124",
            "700"
        ),
        arrayOf(
            "Doctor Name : Laura Kendi",
            "Hospital address : Karen",
            "Exp : 6years",
            "Mobile No:0716550120",
            "900"
        )
    )
   lateinit var tv:TextView
   lateinit var btn:Button
    var doctor_details = arrayOf<Array<String>>()
    var item: HashMap<String, String>? = null
    lateinit var list: ListView
    var sa: SimpleAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_services)

        tv = findViewById(R.id.txthadtitle)
        btn = findViewById(R.id.btnhadback)

        val it = intent
        val title = it.getStringExtra("title")
        tv.setText(title)

        doctor_details =
            if (title!!.compareTo("Family physician") == 0) doctor_details1 else if (title.compareTo(
                    "Dietician"
                ) == 0
            ) doctor_details2 else if (title.compareTo("Dentist") == 0) doctor_details3 else if (title.compareTo(
                    "Surgeon"
                ) == 0
            ) doctor_details4 else doctor_details5



        btn.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    this@ViewServicesActivity,
                    ServicesActivity::class.java
                )
            )
        })

        val lst = findViewById<ListView>(R.id.listviewha)
        lst.adapter = sa

        lst.onItemClickListener =
            OnItemClickListener { adapterView, view, i, l ->
                val it = Intent(this@ViewServicesActivity, ServicesActivity::class.java)
                it.putExtra("text1", title)
                it.putExtra("text2", doctor_details[i][0])
                it.putExtra("text3", doctor_details[i][1])
                it.putExtra("text4", doctor_details[i][3])
                it.putExtra("text5", doctor_details[i][4])
                startActivity(it)
            }
    }
}