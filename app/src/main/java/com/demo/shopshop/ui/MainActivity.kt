package com.demo.shopshop

import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.BaseAdapter
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.demo.shopshop.adapter.AdapterForCategoryRecylerView
import com.demo.shopshop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.addItemDecoration(
            itemDecortion())

        binding.categoryRecylerView.addItemDecoration(
            itemDecortion())

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
 /*   fun setUpRecyclerView(recyclerView: RecyclerView){
        recyclerView.addItemDecoration(itemDecortion())*/


    }

