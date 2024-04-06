package org.apphatchery.codelabs.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import org.apphatchery.codelabs.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {

  private lateinit var binding: ActivityRecyclerViewBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val fake = listOf(
      Email(
        "Google",
        "Lorem Ipsum",
        "Contrary to popular belief, Lorem Ipsum is not simply random text."
      ), Email(
        "LinkedIn",
        "Lorem Ipsum",
        "Contrary to popular belief, Lorem Ipsum is not simply random text."
      ), Email(
        "Dropbox",
        "Lorem Ipsum",
        "Contrary to popular belief, Lorem Ipsum is not simply random text."
      )
    )


    val adapter = RecyclerViewAdapter()
    adapter.submitList(fake)
    binding.recyclerView.adapter = adapter
    binding.recyclerView.layoutManager = GridLayoutManager(this, 1)


  }


  // Widget
  // Items
  // Adapter
  // ViewHolder
  // LayoutManager

}
