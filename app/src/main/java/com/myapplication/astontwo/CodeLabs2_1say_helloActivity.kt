package com.myapplication.astontwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CodeLabs2_1say_helloActivity : AppCompatActivity() {
    private val KEY_COUNT = "key_count"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_labs21say_hello)
        val count = intent.extras?.getString(KEY_COUNT)
        val tvcount = findViewById<TextView>(R.id.tv_count_lab2_1_say_hello)
        tvcount.text = count
    }
}