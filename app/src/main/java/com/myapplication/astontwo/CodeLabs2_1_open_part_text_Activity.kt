package com.myapplication.astontwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CodeLabs2_1_open_part_text_Activity : AppCompatActivity() {
    private val TEXT_PART_KEY = "text"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_labs21_open_part_text)
        val text =intent.extras?.getString(TEXT_PART_KEY)
        val tv = findViewById<TextView>(R.id.tv_lab2_1_open_text)
        tv.text = text
    }
}