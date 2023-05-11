package com.myapplication.astontwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class CodeLabs1_1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_labs11)
        Log.d("LifeCycleCodeLabs1.1","Create")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycleCodeLabs1.1","Start")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycleCodeLabs1.1","Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycleCodeLabs1.1","Pause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycleCodeLabs1.1","Restart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycleCodeLabs1.1","Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycleCodeLabs1.1","Destroy")
    }
}