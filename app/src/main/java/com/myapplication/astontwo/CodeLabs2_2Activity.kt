package com.myapplication.astontwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView

class CodeLabs2_2Activity : AppCompatActivity() {
    private val KEY_COUNT = "key_count"
    private var defaultcount = 0
    lateinit var btn_count: Button
    lateinit var tvcount: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_labs22)
        btn_count = findViewById(R.id.lab2_2_btn_count)
        tvcount = findViewById(R.id.lab2_2_tv_count)
        if (savedInstanceState!=null && savedInstanceState.containsKey(KEY_COUNT)){
            val count = savedInstanceState.getString(KEY_COUNT)
            defaultcount = count?.toInt() ?: 0
            tvcount.text = count
        }
        btn_count.setOnClickListener {
            incrementCountAndOutputInTextView()
        }
    }
    fun incrementCountAndOutputInTextView(){
        defaultcount++
        tvcount.text = defaultcount.toString()
    }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString(KEY_COUNT,defaultcount.toString())
        super.onSaveInstanceState(outState)
    }

}