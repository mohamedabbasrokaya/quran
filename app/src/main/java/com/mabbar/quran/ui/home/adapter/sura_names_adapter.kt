package com.mabbar.quran.ui.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mabbar.quran.R

class sura_names_adapter(val items:List<String>):RecyclerView.Adapter<sura_names_adapter.viewHolder>() {


override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.item_chapter_name,parent,false)
    return viewHolder(view)

}

override fun onBindViewHolder(holder: viewHolder, position: Int) {
    val suraname=items.get(position)
    holder.name.setText(suraname)
}

override fun getItemCount(): Int {
return items.size
}


    class viewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val name:TextView=itemView.findViewById(R.id.chapter_name)


}}