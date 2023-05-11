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
        val btn_lab1_2A = findViewById<Button>(R.id.btn_lab1_2a)
        val btn_lab1_2b = findViewById<Button>(R.id.btn_lab1_2b)
        val btn_lab1_3 = findViewById<Button>(R.id.btn_lab1_3)
        btn_lab1_1.setOnClickListener {
            startActivityForLab1_1()
        }
        btn_lab1_2A.setOnClickListener {
            startActivityForLab1_2A()
        }
        btn_lab1_2b.setOnClickListener {
            startActivityForLab1_2b()
        }
        btn_lab1_3.setOnClickListener {
            startActivityForLab1_3()
        }
    }
    fun startActivityForLab1_1(){
        val intent = Intent(this,CodeLabs1_1Activity::class.java)
        startActivity(intent)
    }
    fun startActivityForLab1_2A(){
        val intent = Intent(this,CodeLabs1_2AActivity::class.java)
        startActivity(intent)
    }
    fun startActivityForLab1_2b(){
        val intent = Intent(this,CodeLabs1_2BActivity::class.java)
        startActivity(intent)
    }
    fun startActivityForLab1_3(){
        val intent = Intent(this,CodeLabs1_3Activity::class.java)
        startActivity(intent)
    }
}