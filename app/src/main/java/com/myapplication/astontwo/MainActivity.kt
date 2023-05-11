package com.myapplication.astontwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_lab1_1 = findViewById<Button>(R.id.btn_lab1_1)
        btn_lab1_1.setOnClickListener {
            startActivityForLab1_1()
        }
    }
    fun startActivityForLab1_1(){
        val intent = Intent(this,CodeLabs1_1Activity::class.java)
        startActivity(intent)
    }
}