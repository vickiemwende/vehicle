package com.example.vehicle_breakdownapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class RegisterActivity : AppCompatActivity() {
    private lateinit var EDT_Username: EditText
    private lateinit var EDT_email: EditText
    private lateinit var EDT_Password: EditText
    private lateinit var EDT_ConfirmPassword: EditText
    private lateinit var BTN_Register: Button

    private lateinit var dbref: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        EDT_Username = findViewById(R.id.edtuser)
        EDT_email = findViewById(R.id.emailedit)
        EDT_Password = findViewById(R.id.inputPassword)
        EDT_ConfirmPassword = findViewById(R.id.inputconfirmpassword)
        BTN_Register = findViewById(R.id.btnRegister)

        dbref = FirebaseDatabase.getInstance().getReference("appuser")

        //progress bar
        var progress = ProgressDialog(this)
        progress.setTitle("Saving Data")
        progress.setMessage("Please Wait")

        BTN_Register.setOnClickListener {
            val fields = listOf(EDT_Username, EDT_email, EDT_Password, EDT_ConfirmPassword)
            val fieldNames = listOf("Username", "UserEmail", "Password", "ConfirmPassword")
            var hasError = false

            for (i in fields.indices) {
                val field = fields[i]
                val fieldName = fieldNames[i]
                val fieldValue = field.text.toString().trim()

                if (fieldValue.isEmpty()) {
                    field.error = "Please fill in the $fieldName field!"
                    field.requestFocus()
                    hasError = true
                }
            }
            if (EDT_Password.text.toString() != EDT_ConfirmPassword.text.toString()) {
                EDT_Password.error = "Passwords does not match!"
                EDT_ConfirmPassword.error = "Passwords does not match!"
                hasError = true
            }

            if (!hasError) {
                val userid = dbref.push().key!!

                val user = ModalUser(
                    username = fields[0].text.toString(),
                    email = fields[1].text.toString(),
                    password = fields[2].text.toString(),
                )
                dbref.child(userid).setValue(user).addOnCompleteListener {
                    Toast.makeText(this, "User Registered Successfully!",
                        Toast.LENGTH_SHORT).show()
                    val register = Intent(this, LoginActivity::class.java)
                    startActivity(register)

                }.addOnFailureListener {
                        err -> Toast.makeText(this, "Error ${err.message}", Toast.LENGTH_SHORT).show() }
            }
        }
    }
}