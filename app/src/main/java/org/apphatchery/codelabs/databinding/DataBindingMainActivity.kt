

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import org.apphatchery.codelabs.databinding.ActivityMainBinding
import org.apphatchery.codelabs.databinding.models.Person
import org.apphatchery.codelabs.databinding.adapter.PersonAdapter

class DataBindingMainActivity : AppCompatActivity(){

    private lateinit var binding : ActivityMainBinding
    private lateinit var adapter: PersonAdapter
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val people = arrayListOf<Person>(
            Person(
                "Dexter"
            ),
            Person(
                "Hope"
            ),
            Person(
                "Kazama"
            ),
            Person(
                "Strider"
            ),
        )
        adapter = PersonAdapter(people)
        binding.recyclerView.layoutManager= LinearLayoutManager(this)
        with(binding){

            recyclerView.adapter = adapter
        }
    }
}