package com.myapplication.astontwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CodeLabs2_1Activity : AppCompatActivity() {
    private val TEXT_PART_KEY = "text"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_labs21)
        val btn_part_one = findViewById<Button>(R.id.btn_lab2_1_to_act_with_text_part_one)
        val btn_part_two = findViewById<Button>(R.id.btn_lab2_1_to_act_with_text_part_two)
        val btn_part_three = findViewById<Button>(R.id.btn_lab2_1_to_act_with_text_part_three)
        val btn_homework = findViewById<Button>(R.id.btn_lab2_1_homework)
        btn_part_one.setOnClickListener {
            startActForOpenPartText(textpartone())
        }
        btn_part_two.setOnClickListener {
            startActForOpenPartText(textparttwo())
        }
        btn_part_three.setOnClickListener {
            startActForOpenPartText(textpartthree())
        }
        btn_homework.setOnClickListener {
            startActHomeWork()
        }
    }
    fun startActForOpenPartText(textpart: String){
        val intent = Intent(this,CodeLabs2_1_open_part_text_Activity::class.java)
        intent.putExtra(TEXT_PART_KEY.toString(),textpart)
        startActivity(intent)
    }
    fun textpartone():String{
        val textpart = this.getString(R.string.labs_2_1_text_part_one)
        return textpart
    }
    fun textparttwo():String{
        val textpart = this.getString(R.string.labs_2_1_text_part_two)
        return textpart
    }
    fun textpartthree():String{
        val textpart = this.getString(R.string.labs_2_1_text_part_three)
        return textpart
    }
    fun startActHomeWork(){
        val intent = Intent(this,CodeLabs2_1_homework::class.java)
        startActivity(intent)
    }
}