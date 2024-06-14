package com.example.enigmaprojectin_dev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.enigmaprojectin_dev.databinding.FragmentMainBinding
import com.example.enigmaprojectin_dev.network.NetworkClient

class MainFragment(
    private val listener: Navigation
) : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fragmentText.text = "Fragment text updated"
        val data: List<String> = listOf(
            "Musick 1",
            "Musick 2",
            "Musick 3",
            "Musick 4"
        )

        binding.myList.layoutManager = LinearLayoutManager(this.requireContext())
        val myAdapter = MuzickAdapter()
        binding.myList.adapter = myAdapter
        myAdapter.setList(data)
        val networkClient = NetworkClient()
        networkClient.initClient()
        networkClient.getImage()
        binding.fragmentText.setOnClickListener {
            listener.navigateToFragmentNext()
        }
    }
}

