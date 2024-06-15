package com.example.coffeshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var image1 = findViewById<ImageView>(R.id.imageView8)
        image1.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
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

        var image4 = findViewById<ImageView>(R.id.imageView18)
        image4.setOnClickListener {
            val intent = Intent(this, UserAccountActivity::class.java)
            startActivity(intent)
        }
    }
}