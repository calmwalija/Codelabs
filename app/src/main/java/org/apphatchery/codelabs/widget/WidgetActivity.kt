package org.apphatchery.codelabs.widget

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.apphatchery.codelabs.databinding.ActivityWidgetBinding

class WidgetActivity : AppCompatActivity() {


  private lateinit var binding: ActivityWidgetBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityWidgetBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.button.setOnClickListener {
      val textInput = binding.editTextText.text.toString()
      binding.textView.text = textInput
    }



  }


}