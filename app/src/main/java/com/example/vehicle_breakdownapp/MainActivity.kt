package com.example.vehicle_breakdownapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    lateinit var editlocation: EditText
    lateinit var editservice: EditText
    lateinit var btnphoto: Button
    lateinit var btndata: Button
    lateinit var reg: Button

    @SuppressLint("MissingInflatedId", "CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        reg = findViewById(R.id.btn_register)
        editlocation = findViewById(R.id.edt_location)
        editservice = findViewById(R.id.edt_service)
        btnphoto = findViewById(R.id.btn_photo)
        btndata = findViewById(R.id.btn_data)


        val database = FirebaseDatabase.getInstance()
        val databaseRef = database.getReference("cars")


        reg.setOnClickListener {
            var intent = Intent(this, registrationActivity::class.java)
            startActivity(intent)
        }
        btndata.setOnClickListener {

            var viewcars = Intent(this, ViewServicesActivity::class.java)


        }

        btnphoto.setOnClickListener {
            val go_tologin = Intent(this, ServicesActivity::class.java)
            startActivity(go_tologin)
        }

        btndata.setOnClickListener {
            val gotologin = Intent(this, HomeActivity::class.java)
            startActivity(gotologin)
        }


            val location = editlocation.text.toString().trim()
            val service = editservice.text.toString().trim()

            val id = System.currentTimeMillis().toString()

            var ref = database.getReference("mechanic/" + id)

            //validation
            if (location.isEmpty() || service.isEmpty() ) {
                Toast.makeText(this, "Cannot submit an empty field", Toast.LENGTH_SHORT).show()

            } else {

                //try to upload data to firebase
                val userService = Mechanicservice(location, service,id)
                //create a reference to firebaseDatabase

                 ref = FirebaseDatabase.getInstance().getReference().child("mechanic")


                ref.setValue(userService).addOnCompleteListener {

                    if (it.isSuccessful) {
                        Toast.makeText(
                            this, "Mechanic Data Uploaded Successfully",
                            Toast.LENGTH_LONG
                        ).show()
                    } else {
                        Toast.makeText(
                            this, "Failed tO Save Mechanic Info",
                            Toast.LENGTH_LONG
                        ).show()
                    }

                }


            }

        }
    }
