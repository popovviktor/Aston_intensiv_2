package com.myapplication.astontwo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ShareCompat

class CodeLabs2_3Activity : AppCompatActivity() {
    lateinit var editWeb:EditText
    lateinit var editMap:EditText
    lateinit var editMessage:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_labs23)
        editWeb = findViewById(R.id.lab2_3_edit_web)
        editMap = findViewById(R.id.lab2_3_edit_map)
        editMessage = findViewById(R.id.lab2_3_edit_message)
        val btn_web = findViewById<Button>(R.id.lab2_3_btn_web)
        val btn_map = findViewById<Button>(R.id.lab2_3_btn_map)
        val btn_message = findViewById<Button>(R.id.lab2_3_btn_message)
        val btn_camera = findViewById<Button>(R.id.lab2_3_btn_camera)
        btn_web.setOnClickListener {
            openWeb()
        }
        btn_map.setOnClickListener {
            openMap()
        }
        btn_message.setOnClickListener {
            sendMessage()
        }
        btn_camera.setOnClickListener {
            takePicture()
        }
    }
    fun openWeb(){
        val url = editWeb.text.toString()
        val webpageUri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW,webpageUri)
        startActivity(intent)
    }
    fun openMap(){
        val location = editMap.text.toString()
        val locationUri = Uri.parse("geo:0,0?q="+location)
        val intent = Intent(Intent.ACTION_VIEW,locationUri)
        startActivity(intent)
    }
    fun sendMessage(){
        val message = editMessage.text.toString()
        val intent = Intent(Intent.ACTION_SEND)
        intent.setType("text/plain")
        intent.putExtra(Intent.EXTRA_TEXT,message)
        startActivity(intent)
    }
    fun takePicture(){
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivity(intent)
    }
}