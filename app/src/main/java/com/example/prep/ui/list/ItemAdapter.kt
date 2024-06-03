package com.example.prep.ui.list

import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.prep.R
import com.example.prep.databinding.ItemViewBinding
import com.example.prep.model.data.Item

class ItemAdapter(private val items: List<Item>, private val activity: Activity) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val binding: ItemViewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(listItem: Item) {
            binding.itemTextView.text = listItem.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(ItemViewBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = items.size

}
