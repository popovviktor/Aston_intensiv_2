package com.myapplication.astontwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CodeLabs2_1_homework : AppCompatActivity() {
    private val KEY_COUNT = "key_count"
    private var defaultcount = 0
    lateinit var btn_count: Button
    lateinit var btn_say_hello: Button
    lateinit var tvcount: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_labs21_homework)
        btn_count = findViewById(R.id.button_lab2_1_count)
        btn_say_hello =findViewById(R.id.button_lab2_1_say_hello)
        tvcount = findViewById(R.id.tv_lab2_1_homework)
        btn_count.setOnClickListener {
            incrementCountAndOutputInTextView()
        }
        btn_say_hello.setOnClickListener {
            startActSayHello()
        }
    }
    fun incrementCountAndOutputInTextView(){
        defaultcount++
        tvcount.text = defaultcount.toString()
    }
    fun startActSayHello(){
        val intent = Intent(this,CodeLabs2_1say_helloActivity::class.java)
        intent.putExtra(KEY_COUNT.toString(),defaultcount.toString())
        startActivity(intent)
    }
}