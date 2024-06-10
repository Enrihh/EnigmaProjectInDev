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




           fun openMainFragment() {
               supportFragmentManager.commit {
                   setReorderingAllowed(true)
                   add(R.id.root_container, MainFragment::class.java, null)
               }
           }





    }
}
