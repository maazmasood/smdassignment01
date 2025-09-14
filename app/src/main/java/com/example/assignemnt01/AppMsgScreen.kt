package com.example.assignemnt01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.ImageView
import android.widget.TextView
import com.example.assignemnt01.R
import com.example.assignemnt01.LoginFile


class AppMsgScreen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_msgscreen)

        val backbutton = findViewById<ImageView>(R.id.backbutton)
        backbutton.setOnClickListener {
            val intent = Intent(this, AppMainScreen::class.java)
            startActivity(intent)
        }

        val plusicononright = findViewById<ImageView>(R.id.plusicononright)
        plusicononright.setOnClickListener {
            val intent = Intent(this, AppCallScreen::class.java)
            startActivity(intent)
        }


    }






}