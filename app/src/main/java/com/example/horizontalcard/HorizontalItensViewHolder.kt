package com.example.horizontalcard
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.horizontalcard.databinding.ListItemLayoutBinding

class HorizontalItensViewHolder(binding: ListItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    val buttonCLick : Button = binding.buttonClick
}