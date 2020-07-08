package com.example.test_application.ui.home

import android.view.*
import androidx.recyclerview.widget.RecyclerView
import com.example.test_application.R

class CategoryHomeAdaptor(val itemView: ArrayList<CategoryModel>)
    : RecyclerView.Adapter<CategoryHomeAdaptor.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_category, parent, false))
    }

    override fun getItemCount(): Int {
        return itemView.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder
    }

    class ViewHolder(itemsView: View): RecyclerView.ViewHolder(itemsView)
        fun bind( model :CategoryModel){

        }
}