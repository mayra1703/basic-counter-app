package com.example.project02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewCounter = findViewById<TextView>(R.id.textViewCounter)
        val btnIncrease = findViewById<Button>(R.id.btnIncrease)
        val btnDecrease = findViewById<Button>(R.id.btnDecrease)

        btnIncrease.setOnClickListener {
            counter++
            textViewCounter.text = counter.toString()
        }

        btnDecrease.setOnClickListener {
            counter--
            textViewCounter.text = counter.toString()
        }
    }
}