package com.example.coffeshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class ResetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        val button1: Button = findViewById(R.id.btnSignIn)

        button1.setOnClickListener {
            val intent = Intent(this, ConfirmResetPswdActivity::class.java)
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.btnSignUpNow)

        button2.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}