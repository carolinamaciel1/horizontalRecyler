package com.example.horizontalcard

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout.HORIZONTAL
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.horizontalcard.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initializeActivityMainBinding()

        val recyclerView = binding.recyclerView
        val namesButton = listOf("Botao1", "Botao2", "Botao 3", "Botao 4", "Botao 5", "Botao 6")

        val adapter = RecyclerHorizontalItensAdapter(namesButton)
        val linearLayoutManager = LinearLayoutManager(this, HORIZONTAL, false)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = linearLayoutManager

    }

    private fun initializeActivityMainBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}