package com.demo.shopshop.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.demo.shopshop.MainActivity
import com.demo.shopshop.R
import com.demo.shopshop.databinding.ActivityBookOpenBinding
import com.demo.shopshop.databinding.ActivityMainBinding

class BookOpenActivity : AppCompatActivity() {
   private lateinit var binding: ActivityBookOpenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookOpenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.goToCart.setOnClickListener {
            val intent = Intent(this,CheckOutActivity::class.java)
            startActivity(intent)
        }
        binding.imageViewBackBtn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

}