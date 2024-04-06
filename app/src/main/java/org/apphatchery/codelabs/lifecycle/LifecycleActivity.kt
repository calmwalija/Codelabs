package org.apphatchery.codelabs.lifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LifecycleActivity : AppCompatActivity() {

  override fun onResume() {
    super.onResume()
    println("onResume")
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    println("onCreate")
  }

  override fun onStart() {
    super.onStart()
    println("onStart")
  }

  override fun onStop() {
    super.onStop()
    println("onStop")
  }

  override fun onDestroy() {
    super.onDestroy()
    println("onDestroy")
  }

}