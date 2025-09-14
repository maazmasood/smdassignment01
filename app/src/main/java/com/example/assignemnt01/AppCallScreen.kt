package com.example.assignemnt01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.ImageButton
import android.widget.TextView
import com.example.assignemnt01.R
import com.example.assignemnt01.LoginFile


class AppCallScreen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_callscreen)

        val callhung = findViewById<ImageButton>(R.id.callhung)
        callhung.setOnClickListener {
            val intent = Intent(this, AppMsgScreen::class.java)
            startActivity(intent)
        }

    }






}