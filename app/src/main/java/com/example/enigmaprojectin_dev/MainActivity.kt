package com.example.enigmaprojectin_dev


import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.enigmaprojectin_dev.databinding.PlayermuzickBinding
import com.example.enigmaprojectin_dev.network.NetworkClient

class MainActivity : AppCompatActivity() {

    private var clickCount: Int = 0
    private lateinit var binding: PlayermuzickBinding


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PlayermuzickBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.button2.text = "Кнопка была нажата $clickCount раз"
//
//        binding.button2.setOnClickListener {
//            clickCount++
//            updateClickCount()
//        }

//        binding.button3.setOnClickListener {
//            Log.e("MY_TAG", "My message")
//            updateClickCount()
//        }
//
//        binding.button4.setOnClickListener {
//            clickCount++
//            updateClickCount()
//        }
//
//        binding.button5.setOnClickListener {
//            Log.e("MY_TAG", "My message")
//            updateClickCount()
//        }

        val data: List<String> = listOf(
            "Musick 1",
            "Musick 2",
            "Musick 3",
            "Musick 4"
        )

        binding.myList.layoutManager = LinearLayoutManager(this)
        val myAdapter = MuzickAdapter()
        binding.myList.adapter = myAdapter
        myAdapter.setList(data)
        val networkClient = NetworkClient()
        networkClient.initClient()
        networkClient.getImage()
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add(R.id.root_container, MainFragment::class.java, null)
            }
        }


//    @SuppressLint("SetTextI18n")
//    private fun updateClickCount() {
//        binding.button2.text = "Кнопка была нажата $clickCount раз"
//    }

    }
}
