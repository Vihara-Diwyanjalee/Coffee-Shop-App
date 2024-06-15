package com.example.coffeshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnboardingActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)

        val button1: Button = findViewById(R.id.button2)

        button1.setOnClickListener {
            val intent = Intent(this, OnboardingActivity3::class.java)
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.btnSkip2)

        button2.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}