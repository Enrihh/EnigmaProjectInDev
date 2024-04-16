package com.example.simplecounter

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.enigmaprojectin_dev.databinding.PlayermuzickBinding

class MainActivity : AppCompatActivity() {

    private var clickCount: Int = 0
    private lateinit var binding: PlayermuzickBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PlayermuzickBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.button2.text = "Кнопка была нажата $clickCount раз"

        binding.button2.setOnClickListener {
            clickCount++
            updateClickCount()
        }

        binding.button3.setOnClickListener {
            Log.e("MY_TAG", "My message")
            updateClickCount()
        }
        binding.button4.setOnClickListener{
            clickCount++
            updateClickCount()
        }
        binding.button5.setOnClickListener{
            Log.e("MY_TAG", "My message")
            updateClickCount()
        }
    }

    private fun updateClickCount() {
        binding.button2.text = "Кнопка была нажата $clickCount раз"
    }
}