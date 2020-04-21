package com.example.portfolioapp

import android.content.Intent
import android.net.Uri
import android.net.UrlQuerySanitizer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val profile = findViewById<ImageView>(R.id.profile)
        profile.setOnClickListener {
            val intent = Intent ( applicationContext, Main2Activity::class.java)
            startActivity(intent)
        }

        val name = findViewById<TextView>(R.id.name)
        name.setOnClickListener {
            val intent = Intent ( applicationContext, Main2Activity::class.java)
            startActivity(intent)
        }

        play_store.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEARCH
            startActivity(intent)
        }

        github.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_WEB_SEARCH
            startActivity(intent)
        }

        bitbucket.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_WEB_SEARCH
            startActivity(intent)
        }

        facebook.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.type = "text/plain"
            startActivity(intent)
        }

        twitter.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.type = "text/plain"
            startActivity(intent)
        }

        instagram.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.type = "text/plain"
            startActivity(intent)
        }

        googleplus.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.type = "text/plain"
            startActivity(intent)
        }

        youtube.setOnClickListener {
            val intent = Intent()
             intent.action = Intent.ACTION_SEARCH
                startActivity(intent)
        }

        dribbble.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_WEB_SEARCH
            startActivity(intent)
        }

        linkedin.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.type = "text/plain"
            startActivity(intent)
        }

        email.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.type = "text/plain"
            startActivity(intent)
        }

        whatsapp.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.type = "text/plain"
            startActivity(intent)
        }

        skype.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.type = "text/plain"
            startActivity(intent)
        }

        google.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_WEB_SEARCH
            startActivity(intent)
        }

        android.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_WEB_SEARCH
            startActivity(intent)
        }

        website.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_WEB_SEARCH
            startActivity(intent)
        }
    }
}