package com.hublet.hubletintern

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private var txtCreateAcc: TextView? = null
    private var btnLogin: TextView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        txtCreateAcc = findViewById(R.id.txt_sign_in)
        btnLogin = findViewById(R.id.btn_login)


        txtCreateAcc?.setOnClickListener {
            Toast.makeText(this, "Create Account", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
        btnLogin?.setOnClickListener {
            Toast.makeText(this, "User Profile", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)
        }


    }
}