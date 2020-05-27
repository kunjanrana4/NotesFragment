package com.example.notesfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),FirstFragment.GetData {

    lateinit var firstFragment: FirstFragment
    lateinit var secondFragment: SecondFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstFragment = first_fragment as FirstFragment
        firstFragment.get = this
        secondFragment = second_fragment as SecondFragment
    }
    override fun sendData(title: String, description: String) {
        secondFragment.displayData(title, description)
    }
}
