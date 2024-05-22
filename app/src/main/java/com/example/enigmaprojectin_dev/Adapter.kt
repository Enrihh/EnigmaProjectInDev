package com.example.enigmaprojectin_dev

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.enigmaprojectin_dev.databinding.ItemViewBinding

class MyListAdapter : RecyclerView.Adapter<MyListAdapter.MyViewHolder>() {

    private var dataList: List<String> = listOf()

    @SuppressLint("NotifyDataSetChanged")
    fun setList(data: List<String>) {
        this.dataList = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size

    inner class MyViewHolder(private val binding: ItemViewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: String) {
            binding.textView1.text = data
            binding.textView2.text = data
            binding.textView3.text = data
            binding.textView4.text = data

        }
    }
}
