package org.apphatchery.codelabs.nope

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.apphatchery.codelabs.R

class AdapterClass(private val dataList: ArrayList<DataClass>) :
    RecyclerView.Adapter<AdapterClass.ViewHolderClass>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_activity, parent, false)
        return ViewHolderClass(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = dataList[position]
        holder.text.text = currentItem.text
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class ViewHolderClass(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val text: TextView = itemView.findViewById(R.id.textView)
    }

//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClassyy {
//        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_activity, parent, )
//        return ViewHolderClassyy(itemView )
//    }
//
//    override fun getItemCount(): Int {
//        return dataList.size
//    }
//
//    override fun onBindViewHolder(holder: ViewHolderClassyy, position: Int) {
//
//    }
}
