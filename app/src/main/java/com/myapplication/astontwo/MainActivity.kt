package com.myapplication.astontwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var mcount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ActivityCycle","create")
        setContentView(R.layout.activity_main)



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