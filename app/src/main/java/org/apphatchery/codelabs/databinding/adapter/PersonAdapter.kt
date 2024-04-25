package org.apphatchery.codelabs.databinding.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.apphatchery.codelabs.databinding.SingleItemActivityBinding
import org.apphatchery.codelabs.databinding.models.Person


class PersonAdapter : ListAdapter<Person, PersonAdapter.ViewHolder>(diffUtil){

    class ViewHolder(private val binding: SingleItemActivityBinding) : RecyclerView.ViewHolder(binding.root){

        fun onBind(person: Person){
            binding.human = person
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = SingleItemActivityBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val person = getItem(position)
        holder.onBind(person)
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Person>() {
            override fun areItemsTheSame(oldItem: Person, newItem: Person): Boolean {
                return oldItem.name == newItem.name
            }

            override fun areContentsTheSame(oldItem: Person, newItem: Person): Boolean {
                return oldItem == newItem
            }
        }
    }
}
