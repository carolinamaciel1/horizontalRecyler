package com.example.horizontalcard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.horizontalcard.databinding.ListItemLayoutBinding

class RecyclerHorizontalItensAdapter(private val namesButton: List<String>) : RecyclerView.Adapter<HorizontalItensViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalItensViewHolder {
        val viewItem = ListItemLayoutBinding.inflate(LayoutInflater.from(parent.context))
        return HorizontalItensViewHolder(viewItem)
    }

    override fun onBindViewHolder(holder: HorizontalItensViewHolder, position: Int) {
        holder.buttonCLick.text = namesButton[position]
    }

    override fun getItemCount(): Int {
        return namesButton.size
    }
}