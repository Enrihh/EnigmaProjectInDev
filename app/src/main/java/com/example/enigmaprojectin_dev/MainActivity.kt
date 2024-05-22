package com.example.enigmaprojectin_dev

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.enigmaprojectin_dev.databinding.PlayermuzickBinding

class MainActivity : AppCompatActivity() {

    private var clickCount: Int = 0
    private lateinit var binding: PlayermuzickBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PlayermuzickBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.text = "Кнопка была нажата $clickCount раз"

        binding.button2.setOnClickListener {
            clickCount++
            updateClickCount()
        }

        binding.button3.setOnClickListener {
            Log.e("MY_TAG", "My message")
            updateClickCount()
        }

        binding.button4.setOnClickListener {
            clickCount++
            updateClickCount()
        }

        binding.button5.setOnClickListener {
            Log.e("MY_TAG", "My message")
            updateClickCount()
        }

        val data: List<String> = listOf(
            "String 1",
            "String 2",
            "String 3"
        )

        binding.myList.layoutManager = LinearLayoutManager(this)
        val myAdapter = MyListAdapter()
        binding.myList.adapter = myAdapter
        myAdapter.setList(data)
    }

    private fun updateClickCount() {
        binding.button2.text = "Кнопка была нажата $clickCount раз"
    }
}
