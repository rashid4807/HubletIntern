package com.hublet.hubletintern

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var btnSignIn: Button? = null
    private var txtCreateAcc: TextView? = null

    @SuppressLint("CutPasteId", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSignIn = findViewById(R.id.btn_sign_in)
        txtCreateAcc = findViewById(R.id.txt_sign_in)

        btnSignIn?.setOnClickListener {
            Toast.makeText(this, "Sign in", Toast.LENGTH_LONG).show()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        txtCreateAcc?.setOnClickListener {
            Toast.makeText(this, "Create Account", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity, SignInActivity::class.java)
            startActivity(intent)
        }

    }
}