package com.example.fragmentpractice.Fragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentpractice.databinding.ItemsBinding

/**
 * 2023-01-18
 * pureum
 */
class FragmentAdapter: RecyclerView.Adapter<FragmentAdapter.AdapterViewHolder>(){

    var dataList = arrayListOf<String>()
    set(value){
        field = value
        notifyDataSetChanged()
    }

    inner class AdapterViewHolder(private val binding: ItemsBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(data:String){
            binding.textView.text=data
            binding.textView2.text=data
            binding.textView3.text=data
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
        val binding = ItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AdapterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size

}