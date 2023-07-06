package com.example.vehicle_breakdownapp

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class LoginActivity : AppCompatActivity() {

    lateinit var edt_username: EditText
    lateinit var edt_email: EditText
    lateinit var btn_login: Button

    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edt_username = findViewById(R.id.edtuser)

        edt_email = findViewById(R.id.input_email)
        btn_login = findViewById(R.id.btnlogin)
        auth= FirebaseAuth.getInstance()

        btn_login.setOnClickListener {

            //navigate back to login
//            var gotologin = Intent(this, RegisterActivity::class.java)
//            startActivity(gotologin)

        }


        btn_login.setOnClickListener {

                            //navigate back to login
                            var gotolog = Intent(this, MainActivity::class.java)
                            startActivity(gotolog)

                        }
                    }
                }




