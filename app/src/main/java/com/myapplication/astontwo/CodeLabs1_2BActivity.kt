package com.myapplication.astontwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class CodeLabs1_2BActivity : AppCompatActivity() {
    private var defaultcount = 0
    lateinit var btn_count: Button
    lateinit var btn_toast: Button
    lateinit var tvcount: TextView
    lateinit var btn_zero:Button
    private var count_even:Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_labs12_bactivity)
        btn_count = findViewById(R.id.button_count_lab1_2b)
        btn_toast = findViewById(R.id.button_toast_lab1_2b)
        btn_zero = findViewById(R.id.button_zero_indicate)
        tvcount = findViewById(R.id.show_count_lab1_2b)
        btn_count.setOnClickListener {
            incrementCountAndOutputInTextView()
            back_btn_count()
        }
        btn_toast.setOnClickListener {
            doToast()
        }
    }
    fun doToast(){
        val textToast = this.getString(R.string.lab1_2a_toast_message)
        Toast.makeText(this,textToast, Toast.LENGTH_LONG)
            .show()
    }
    fun zeroindicatedisable(){
        btn_zero.backgroundTintList = this.getColorStateList(R.color.zerodisable)
    }
    fun back_btn_count(){
        if (count_even == true){
            evenindicatedisable()
            count_even = false
        }else{
            count_even = true
            evenindicateenable()
        }
    }
    fun evenindicateenable(){
        btn_count.backgroundTintList = this.getColorStateList(R.color.countenable)
    }fun evenindicatedisable(){
        btn_count.backgroundTintList = this.getColorStateList(R.color.countdisable)
    }
    fun incrementCountAndOutputInTextView(){
        defaultcount++
        if(defaultcount==1){
            zeroindicatedisable()
        }
        tvcount.text = defaultcount.toString()
    }
}