package com.hublet.hubletintern

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hublet.hubletintern.adapter.PersonAdapter
import com.hublet.hubletintern.model.Person
import com.squareup.picasso.Picasso
import java.util.concurrent.Executors

class NetworkingActivity : AppCompatActivity() {

    private var rclvPersonList: RecyclerView? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_networking)

        rclvPersonList = findViewById(R.id.rclv_person_list)
        rclvPersonList?.layoutManager = GridLayoutManager(this, 2)

        rclvPersonList?.adapter = PersonAdapter(getPersonList())

    }

    private fun getPersonList() : ArrayList<Person>{
        val personList = ArrayList<Person>()
        for (item in 0..10){
            val person = Person("Marzia $item", "marzia.$item@gmail.com", "https://i.ibb.co/qg8Q5jL/image.jpg")
            personList.add(person)
        }
        return personList
    }
}