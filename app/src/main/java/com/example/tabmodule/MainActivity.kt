package com.example.tabmodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pager.adapter = PageAdapter(supportFragmentManager, 0)
        tablayout.setupWithViewPager(pager)
    }

    public fun Test() {
        pager.currentItem = 1
    }
}