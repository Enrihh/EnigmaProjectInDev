package com.example.simplecounter

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var clickCount: Int = 0
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.playermuzick)

        textView = findViewById(R.id.my_text)
        textView.text = "Кнопка была нажата $clickCount раз"

        findViewById<Button>(R.id.increment_button).setOnClickListener {
            clickCount++
            updateClickCount()
        }

        textView.setOnClickListener {
            Log.e("MY_TAG", "My message")
        }
    }

    private fun updateClickCount() {
        textView.text = "Кнопка была нажата $clickCount раз"
    }
}