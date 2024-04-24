package org.apphatchery.codelabs.databinding.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.apphatchery.codelabs.databinding.SingleItemActivityBinding
import org.apphatchery.codelabs.databinding.models.Person


class PersonAdapter (private val dataset : ArrayList<Person>) : RecyclerView.Adapter<PersonAdapter.ViewHolder>(){

    lateinit var binding: SingleItemActivityBinding
    class ViewHolder(var view: SingleItemActivityBinding) : RecyclerView.ViewHolder(view.root){


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = SingleItemActivityBinding.inflate(LayoutInflater.from(parent.context), parent, )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.view.human = dataset[position]
    }
}