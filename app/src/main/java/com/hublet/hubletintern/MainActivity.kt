package com.hublet.hubletintern

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtMessage : TextView = findViewById(R.id.txt_result)

        val txtCountSum : TextView = findViewById(R.id.txt_first_number)

        val txtMatchString : TextView = findViewById(R.id.txt_second_number)
        txtMatchString.text =  BasicKotlin().matchString

        txtCountSum.setOnClickListener {
            val sum = Calculator().addNumber(8, 6)
            Log.d("Calculator","countsum: $sum")
        }


        txtMatchString.setOnClickListener {
            BasicKotlin().matchString("Hello")
        }
    }
}