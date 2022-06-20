package com.example.imoclone.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imoclone.R
import com.example.imoclone.adapter.ChatAdapter
import com.example.imoclone.model.Chat

class PageChatFragment : Fragment() {

    lateinit var recyclerView: RecyclerView

    private fun getAllChats(): ArrayList<Chat> {
        val  chats : ArrayList<Chat>  = ArrayList<Chat>()

        chats.add(Chat(R.drawable.android, "Islombek Nasriddinov",1))
        chats.add(Chat(R.drawable.photo, "Muslimbek Nasriddinov",3))
        chats.add(Chat(R.drawable.person, "Usmonbek Nasriddinov",0))
        chats.add(Chat(R.drawable.android, "Islombek Nasriddinov",1))
        chats.add(Chat(R.drawable.photo, "Muslimbek Nasriddinov",3))
        chats.add(Chat(R.drawable.person, "Usmonbek Nasriddinov",0))
        chats.add(Chat(R.drawable.android, "Islombek Nasriddinov",1))
        chats.add(Chat(R.drawable.photo, "Muslimbek Nasriddinov",3))
        chats.add(Chat(R.drawable.person, "Usmonbek Nasriddinov",0))
        chats.add(Chat(R.drawable.android, "Islombek Nasriddinov",1))
        chats.add(Chat(R.drawable.photo, "Muslimbek Nasriddinov",3))
        chats.add(Chat(R.drawable.person, "Usmonbek Nasriddinov",0))
        chats.add(Chat(R.drawable.android, "Islombek Nasriddinov",1))
        chats.add(Chat(R.drawable.photo, "Muslimbek Nasriddinov",3))
        chats.add(Chat(R.drawable.person, "Usmonbek Nasriddinov",0))
        chats.add(Chat(R.drawable.android, "Islombek Nasriddinov",1))
        chats.add(Chat(R.drawable.photo, "Muslimbek Nasriddinov",3))
        chats.add(Chat(R.drawable.person, "Usmonbek Nasriddinov",0))
        chats.add(Chat(R.drawable.android, "Islombek Nasriddinov",1))
        chats.add(Chat(R.drawable.photo, "Muslimbek Nasriddinov",3))
        chats.add(Chat(R.drawable.person, "Usmonbek Nasriddinov",0))


        return chats
    }

    private fun refreshAdapter(chats: ArrayList<Chat>) {
        var  adapter = ChatAdapter(this, chats)
        recyclerView!!.adapter = adapter
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.fragment_chat, container, false)
        recyclerView = view. findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setLayoutManager(LinearLayoutManager(activity))
        refreshAdapter(getAllChats())
        return view
    }
}
