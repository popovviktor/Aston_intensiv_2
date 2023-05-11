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
        val tv = findViewById<TextView>(R.id.show_count)
        val btn_count = findViewById<Button>(R.id.button_count)
        val btn_toast = findViewById<Button>(R.id.button_toast)
        tv.text = "Happy Bithday!"
        tv.text = mcount.toString()

        btn_toast.setOnClickListener {
            Toast.makeText(this,R.string.toast_message,Toast.LENGTH_LONG).show()
        }
        btn_count.setOnClickListener {
            mcount++
            tv.text = mcount.toString()
        }

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