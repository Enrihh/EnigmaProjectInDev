package com.example.enigmaprojectin_dev

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyLIstofMuzick: RecyclerView.Adapter<MyLIstofMuzick.MyViewHolder>() {
    private var myData: List<String> = listOf()
    fun setList(list: List<String>){
        myData = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context))
        return MyViewHolder(binding)

    }

    class ItemListBinding {

        lateinit var myTextView: Any
        lateinit var root: View

        companion object {
            fun inflate(from: LayoutInflater?) {

            }
        }
    }

    override fun getItemCount(): Int {
        return myData.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(myData[position])

    }
    class MyViewHolder(
        private val binding: ItemListBinding
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: String){
            binding.myTextView.text = data

        }

    }
}


