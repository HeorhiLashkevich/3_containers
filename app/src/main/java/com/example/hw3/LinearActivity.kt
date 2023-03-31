package com.example.hw3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.app.ActivityCompat

class LinearActivity : AppCompatActivity() {
    private lateinit var toMainFromLinear: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)

        toMainFromLinear = findViewById(R.id.mainFromLinear)
        toMainFromLinear.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)        }
    }
}