package com.example.assignemnt01


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.ImageButton
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.example.assignemnt01.R

class AppSearchPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_searchpagescreen)



            val searchbarbutton = findViewById<ImageView>(R.id.searchbarbutton)
            searchbarbutton.setOnClickListener {
                val intent = Intent(this, AppSearchFilter::class.java)
                startActivity(intent)
            }

        val homeicon = findViewById<ImageButton>(R.id.nav_home)
        homeicon.setOnClickListener {
            val intent = Intent(this, AppMainScreen::class.java)
            startActivity(intent)
        }
    }


}