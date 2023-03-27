package com.example.hw3

import android.annotation.SuppressLint
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
            setContentView(R.layout.activity_constrain)
        }
        toFrameButton.setOnClickListener {
            setContentView(R.layout.activity_frame)
        }
        toLinearButton.setOnClickListener {
            setContentView(R.layout.activity_linear)
        }
    }
}