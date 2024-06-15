package com.example.coffeshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageView

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        var image = findViewById<ImageView>(R.id.imageView1)
        image.setOnClickListener {
            val intent = Intent(this, PaymentSuccessActivity::class.java)
            startActivity(intent)
        }

        var image1 = findViewById<ImageView>(R.id.imageView10)
        image1.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        var image2 = findViewById<ImageView>(R.id.imageView12)
        image2.setOnClickListener {
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
        }

        var image3 = findViewById<ImageView>(R.id.imageView13)
        image3.setOnClickListener {
            val intent = Intent(this, OrderHistoryActivity::class.java)
            startActivity(intent)
        }
    }
}