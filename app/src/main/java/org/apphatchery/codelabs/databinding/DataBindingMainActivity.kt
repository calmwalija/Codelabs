package org.apphatchery.codelabs.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import org.apphatchery.codelabs.databinding.adapter.PersonAdapter
import org.apphatchery.codelabs.databinding.models.Person

class DataBindingMainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val people = listOf(
            Person(
                "Dexter",
            ), Person(
                "Kazama",
            ), Person(
                "Strider",
            )
        )


        val adapter = PersonAdapter()
        adapter.submitList(people)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = GridLayoutManager(this, 1)


    }
}
