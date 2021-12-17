package com.demo.shopshop

import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Adapter
import android.widget.BaseAdapter
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.demo.shopshop.adapter.AdapterForCategoryRecylerView
import com.demo.shopshop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var imgArr: Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        imgArr = arrayOf(
            R.drawable.rectanglefourthree,
            R.drawable.rectanglefourtwo,
            R.drawable.rectanglethreefour,
            R.drawable.ellipse,
            R.drawable.ellipsefour,
            R.drawable.rectanglethreefour
        )
        runable()

        binding.recyclerView.addItemDecoration(
            itemDecortion()
        )

        binding.categoryRecylerView.addItemDecoration(
            itemDecortion()
        )
        binding.recyclerView.adapter = RecyclerViewAdapter(this)
        binding.categoryRecylerView.adapter = AdapterForCategoryRecylerView(this)
    }


    fun itemDecortion(): RecyclerView.ItemDecoration {
        return object : RecyclerView.ItemDecoration() {
            override fun getItemOffsets(
                outRect: Rect,
                view: View,
                parent: RecyclerView,
                state: RecyclerView.State
            ) {
                super.getItemOffsets(outRect, view, parent, state)
                outRect.right = 50
                if (parent.getChildAdapterPosition(view) == 0)
                    outRect.left = 50
            }
        }
    }

    fun runable(){
        val handler: Handler = Handler()
        val run = object : Runnable {
            override fun run() {
                val randomNumber = (0..imgArr.size - 1).random()
                handler.postDelayed(this, 86400000)
                binding.todayOfferImage.setImageResource(imgArr.get(randomNumber))

            }

        }
        handler.post(run)
    }
    }



