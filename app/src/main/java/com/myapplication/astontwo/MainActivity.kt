package com.myapplication.astontwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ActivityCycle","create")
        setContentView(R.layout.activity_main)
        val tv = findViewById<TextView>(R.id.tvmain)
        tv.text = "Happy Bithday!"
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityCycle","resume")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityCycle","start")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityCycle","stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityCycle","destroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActivityCycle","pause")
    }
}