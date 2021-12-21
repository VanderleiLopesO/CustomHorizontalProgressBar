package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editText)
        val progress = findViewById<ProgressBar>(R.id.progress)

        button.setOnClickListener {
            progress.progress = editText.text.toString().toDouble().roundToInt()
        }

    }

}