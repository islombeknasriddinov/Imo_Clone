package com.example.imoclone.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imoclone.R
import com.example.imoclone.adapter.ContactAdapter
import com.example.imoclone.model.Contact

class PageContactFragment : Fragment() {

    lateinit var recyclerView_contact: RecyclerView

    private fun getAllContacts(): ArrayList<Contact> {
        val  contact : ArrayList<Contact>  = ArrayList<Contact>()

        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))
        contact.add(Contact(R.drawable.android, "Islombek Nasriddinov"))






        return contact
    }

    private fun refreshAdapter(contacts: ArrayList<Contact>) {
        var  adapter = ContactAdapter(this, contacts)
        recyclerView_contact!!.adapter = adapter
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.fragment_contact, container, false)
        recyclerView_contact = view. findViewById<RecyclerView>(R.id.recyclerView_contact)
        recyclerView_contact.setLayoutManager(LinearLayoutManager(activity))
        refreshAdapter(getAllContacts())
        return view
    }


}