package com.hublet.hubletintern

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class UserProfileActivity : AppCompatActivity() {
    private var changeInfo: TextView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_profile)
        changeInfo = findViewById(R.id.change_info)

        changeInfo?.setOnClickListener {
            Toast.makeText(this, "Change Info", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ChangeInfoActivity::class.java)
            startActivity(intent)
        }
    }
}