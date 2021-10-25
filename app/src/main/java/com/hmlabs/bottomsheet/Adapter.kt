package com.hmlabs.bottomsheet

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hmlabs.bottomsheet.databinding.ItemRvBinding


class Adapter(
    val items: List<String>?
) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items!!.size
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding =
            ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items!![position])
    }

    inner class ViewHolder(private val viewBinding:  ItemRvBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(data: String) {
               viewBinding.apply {
                   textView2.text = data

               }

        }



}


}

