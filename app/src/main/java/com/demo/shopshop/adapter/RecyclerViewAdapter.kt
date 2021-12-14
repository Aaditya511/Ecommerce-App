package com.demo.shopshop

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.demo.shopshop.ui.BookOpenActivity

class RecyclerViewAdapter(val context: Context): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recylerview_items, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
           // Toast.makeText(it.context, ""+position, Toast.LENGTH_SHORT).show()
            openNewActivity()
        }
    }

    override fun getItemCount(): Int {
       return 20
    }
    fun openNewActivity(){
        val intent = Intent(context,BookOpenActivity::class.java)
        context.startActivity(intent)
    }
}