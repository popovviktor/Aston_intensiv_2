package com.myapplication.astontwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class CodeLabs1_2AActivity : AppCompatActivity() {
    private var defaultcount = 0
    lateinit var btn_count: Button
    lateinit var btn_toast:Button
    lateinit var tvcount:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_labs12_aactivity)
        btn_count = findViewById(R.id.button_count)
        btn_toast = findViewById(R.id.button_toast)
        tvcount = findViewById(R.id.show_count)
        btn_count.setOnClickListener {
            incrementCountAndOutputInTextView()
        }
        btn_toast.setOnClickListener {
            doToast()
        }

    }
    fun incrementCountAndOutputInTextView(){
        defaultcount++
        tvcount.text = defaultcount.toString()
    }
    fun doToast(){
        val textToast = this.getString(R.string.lab1_2a_toast_message)
        Toast.makeText(this,textToast,Toast.LENGTH_LONG)
            .show()
    }

}