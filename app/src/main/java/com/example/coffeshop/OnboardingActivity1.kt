package com.example.coffeshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class OnboardingActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)

        val button1: Button = findViewById(R.id.button1)

        button1.setOnClickListener {
            val intent = Intent(this, OnboardingActivity2::class.java)
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.btnSkip)

        button2.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
