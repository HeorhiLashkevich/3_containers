package com.example.hw3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var toConstraintButton: Button
    private lateinit var toFrameButton: Button
    private lateinit var toLinearButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toConstraintButton = findViewById(R.id.toConstraint)
        toFrameButton = findViewById(R.id.toFrame)
        toLinearButton = findViewById(R.id.toLinear)
        toConstraintButton.setOnClickListener {
            val intent = Intent(this, ConstrainActivity::class.java)
            startActivity(intent)

        }
        toFrameButton.setOnClickListener {
            val intent = Intent(this, FrameActivity::class.java)
            startActivity(intent)
        }
        toLinearButton.setOnClickListener {
            val intent = Intent(this, LinearActivity::class.java)
            startActivity(intent)
        }
    }
}