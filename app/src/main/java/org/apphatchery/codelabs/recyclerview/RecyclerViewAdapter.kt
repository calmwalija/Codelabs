package org.apphatchery.codelabs.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.apphatchery.codelabs.databinding.ActivityRecyclerViewItemBinding

class RecyclerViewAdapter : ListAdapter<Email, RecyclerViewAdapter.CustomViewHolder>(diffUtil) {


  class CustomViewHolder(
    private val binding: ActivityRecyclerViewItemBinding,
  ) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(email: Email) {
      binding.body.text = email.body
      binding.sender.text = email.sender
      binding.title.text = email.title
    }

  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
    return CustomViewHolder(
      ActivityRecyclerViewItemBinding.inflate(
        LayoutInflater.from(parent.context)
      )
    )
  }

  override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
    val email = getItem(position)
    holder.onBind(email)
  }


  companion object {
    val diffUtil = object : DiffUtil.ItemCallback<Email>() {
      override fun areItemsTheSame(oldItem: Email, newItem: Email): Boolean {
        return oldItem.body == newItem.body
      }

      override fun areContentsTheSame(oldItem: Email, newItem: Email): Boolean {
        return oldItem == newItem
      }

    }
  }


}