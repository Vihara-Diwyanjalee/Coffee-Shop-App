package com.example.coffeshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler

class MainActivity : AppCompatActivity() {
    private val delayMillis: Long = 5000 // 5 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Use a Handler to post a delayed action to start the OnBoardActivity
        Handler().postDelayed({
            // Start the OnBoardActivity
            startActivity(Intent(this@MainActivity, OnboardingActivity1::class.java))
            // Finish the MainActivity to prevent returning to it
            finish()
        }, delayMillis)

    }
}