package com.nayan.customnetworksdk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.networksdk.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fetchData()
    }

    private fun fetchData() {
    }
}
