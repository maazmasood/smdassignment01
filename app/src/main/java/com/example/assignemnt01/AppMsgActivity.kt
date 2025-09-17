package com.example.assignemnt01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.example.assignemnt01.R
import com.example.assignemnt01.LoginFile


class AppMsgActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_msgactivity)

        val backbutton = findViewById<ImageButton>(R.id.backbutton)
        backbutton.setOnClickListener {
            val intent = Intent(this, AppMsgScreen::class.java)
            startActivity(intent)
        }

        val calbtn = findViewById<ImageButton>(R.id.call_button)
        calbtn.setOnClickListener {
            val intent = Intent(this, AppCallScreen::class.java)
            startActivity(intent)
        }



    }






}