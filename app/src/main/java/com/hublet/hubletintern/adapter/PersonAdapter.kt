package com.hublet.hubletintern.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hublet.hubletintern.R
import com.hublet.hubletintern.model.Person
import com.squareup.picasso.Picasso

//https://developer.android.com/develop/ui/views/layout/recyclerview

class PersonAdapter(private val personList: ArrayList<Person>) :
    RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    class PersonViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtUserName: TextView = view.findViewById(R.id.txt_user_name)
        val txtUserEmail: TextView = view.findViewById(R.id.txt_user_email)
        val imvUserImage: ImageView = view.findViewById(R.id.imv_user_image)
    }

    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int,
    ): PersonViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.text_row_item, viewGroup, false)

        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(personViewHolder: PersonViewHolder, position: Int) {
        personViewHolder.txtUserName.text = personList[position].userName
        personViewHolder.txtUserEmail.text = personList[position].userEmail

        Picasso.get().load(personList[position].image).into(personViewHolder.imvUserImage)
    }

    override fun getItemCount() = personList.size

}


