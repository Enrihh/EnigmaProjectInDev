package com.example.enigmaprojectin_dev

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.enigmaprojectin_dev.databinding.ItemListBinding

class MuzickAdapter(private val listener: Navigation): RecyclerView.Adapter<MuzickAdapter.MyViewHolder>() {

    private var myData: List<String> = listOf()
    fun setList(list: List<String>){
        myData = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return MyViewHolder(binding, listener)

    }



    override fun getItemCount(): Int {
        return myData.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(myData[position])

    }
    class MyViewHolder(
        private val binding: ItemListBinding, private val listener: Navigation
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: String){
            binding.button.text = data
            binding.button.setOnClickListener {listener.navigateToFragmentNext()}

        }

    }
}


