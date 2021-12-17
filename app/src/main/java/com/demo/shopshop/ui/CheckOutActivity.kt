package com.demo.shopshop.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.demo.shopshop.R
import com.demo.shopshop.databinding.ActivityCheckOutBinding
import kotlin.properties.Delegates

class CheckOutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCheckOutBinding
    var quantity: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckOutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quantity = binding.textViewQuantity.text.toString().toInt()

        binding.backBtnImage.setOnClickListener {
            val intent = Intent(this, BookOpenActivity::class.java)
            startActivity(intent)
        }

        binding.minusIcon.setOnClickListener {
            if (quantity == 1){
                Toast.makeText(this, "U can Not", Toast.LENGTH_SHORT).show()
            }
            else{
                quantity--
                binding.textViewQuantity.text = quantity.toString()
            }

        }
        binding.plusIcon.setOnClickListener {
            quantity++
            binding.textViewQuantity.text = quantity.toString()

        }
    }

}