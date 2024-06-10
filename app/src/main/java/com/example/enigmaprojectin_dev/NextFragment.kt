package com.example.fragmentsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.enigmaprojectin_dev.databinding.FragmentNextBinding
import com.example.fragmentsapp.databinding.FragmentNextBinding

class NextFragment: Fragment() {
    private lateinit var binding: FragmentNextBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNextBinding.inflate(inflater, container, false)
        return binding.root
    }

}