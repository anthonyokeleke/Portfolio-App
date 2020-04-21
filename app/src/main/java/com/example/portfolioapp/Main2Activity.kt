package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val Button = findViewById<Button>(R.id.buttonback)
        Button.setOnClickListener {
            val intent = Intent ( applicationContext, MainActivity::class.java)

            startActivity(intent)
        }
    }
}
