package com.demo.shopshop

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val  bookImg = itemView.findViewById<ImageView>(R.id.imageViewBook)
    val bookName = itemView.findViewById<TextView>(R.id.textViewBookName)
    val authorName = itemView.findViewById<TextView>(R.id.authorName)
}