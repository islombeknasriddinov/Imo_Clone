package com.example.imoclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.imoclone.adapter.ViewPagerAdapter
import com.example.imoclone.fragment.PageChatFragment
import com.example.imoclone.fragment.PageContactFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {


    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager()
    }


    private fun viewPager() {
        viewPager = findViewById<ViewPager>(R.id.viewpager)

        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)


        viewPagerAdapter!!.add(PageChatFragment(), "")
        viewPagerAdapter!!.add(PageContactFragment(), "")


        viewPager.setAdapter(viewPagerAdapter)

        tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        tabLayout.setupWithViewPager(viewPager)

        tabLayout.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_call_24)
        tabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_contacts_24)
    }


}