package com.example.assignemnt01


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.ImageButton
import android.widget.ImageView


class AppMainScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_mainscreen)



    val searchicon = findViewById<ImageButton>(R.id.nav_search)
    searchicon.setOnClickListener {
        val intent = Intent(this, AppSearchPage::class.java)
        startActivity(intent)
    }


        val msgbutton = findViewById<ImageView>(R.id.nav_right2)
        msgbutton.setOnClickListener {
            val intent = Intent(this, AppMsgScreen::class.java)
            startActivity(intent)
        }

    }
}