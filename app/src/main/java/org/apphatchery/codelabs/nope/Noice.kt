package org.apphatchery.codelabs.nope

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.apphatchery.codelabs.R

class Noice : AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState, )
        setContentView(R.layout.recyclerview_something)
       val recyclervieww = findViewById<RecyclerView>(R.id.recyclerview)
        val listt = arrayListOf(
            DataClass(text = "SOme"),
            DataClass(text = "SOme"),
            DataClass(text = "SOme"))
        val dc = AdapterClass(listt)
        recyclervieww.adapter = dc
//        recyclervieww.layoutManager = LinearLayoutManager(this)
    }
}