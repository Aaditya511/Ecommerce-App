package com.demo.shopshop.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.demo.shopshop.R
import com.demo.shopshop.databinding.ActivityCheckOutBinding

class CheckOutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCheckOutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckOutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backBtnImage.setOnClickListener {
            val intent = Intent(this, BookOpenActivity::class.java)
            startActivity(intent)
        }
    }
}