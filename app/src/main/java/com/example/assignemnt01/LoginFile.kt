package com.example.assignemnt01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.TextView
import com.example.assignemnt01.R
import com.example.assignemnt01.SignupFile
import com.example.assignemnt01.AppMainScreen


class LoginFile : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)


        val signuptext = findViewById<TextView>(R.id.signuptext)
        signuptext.setOnClickListener {
            val intent = Intent(this, SignupFile::class.java)
            startActivity(intent)
        }

        val loginbtn = findViewById<TextView>(R.id.login_button)
        loginbtn.setOnClickListener {
            val intent = Intent(this, AppMainScreen::class.java)
            startActivity(intent)
        }


    }



}