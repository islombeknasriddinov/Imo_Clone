package com.example.imoclone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.imoclone.R
import com.example.imoclone.fragment.PageContactFragment
import com.example.imoclone.model.Contact
import com.google.android.material.imageview.ShapeableImageView

class ContactAdapter(var context: PageContactFragment, var items: ArrayList<Contact>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact_view, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val chat = items[position]

        if (holder is ContactViewHolder) {
            var iv_contact_profile = holder.iv_contact_profile
            var tv_contact_fullname = holder.tv_contact_fullname

            iv_contact_profile.setImageResource(chat.contact_profile)
            tv_contact_fullname.text = chat.contact_fullname

        }

        }

    override fun getItemCount(): Int {
        return items.size
    }

}


   class ContactViewHolder(val view: View): RecyclerView.ViewHolder(view){
       var iv_contact_profile: ShapeableImageView
       var tv_contact_fullname: TextView

       init {
           iv_contact_profile =view.findViewById(R.id.iv_contact_profile)
           tv_contact_fullname = view.findViewById(R.id.tv_contact_fullname)
       }
   }

