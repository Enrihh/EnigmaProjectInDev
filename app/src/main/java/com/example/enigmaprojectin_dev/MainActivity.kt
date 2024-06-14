package com.example.enigmaprojectin_dev

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.example.enigmaprojectin_dev.databinding.PlayermuzickBinding

class MainActivity : AppCompatActivity(), Navigation {

    private lateinit var binding: PlayermuzickBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PlayermuzickBinding.inflate(layoutInflater)
        setContentView(binding.root)
        openMainFragment()
    }

    private fun openMainFragment() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.root_container, MainFragment::class.java, null)
        }
    }

    override fun navigateToFragmentNext() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.root_container, NextFragment::class.java, null)
            addToBackStack(null)
        }
    }
}

