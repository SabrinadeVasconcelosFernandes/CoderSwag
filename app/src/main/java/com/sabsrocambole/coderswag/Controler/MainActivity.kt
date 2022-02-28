package com.sabsrocambole.coderswag.Controler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.sabsrocambole.coderswag.Adapters.CategoryAdapter
import com.sabsrocambole.coderswag.Adapters.CategoryRecycleAdapter
import com.sabsrocambole.coderswag.Model.Category
import com.sabsrocambole.coderswag.R
import com.sabsrocambole.coderswag.Services.DataService
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    //var categoryName = findViewById<TextView>(R.id.catergoryName)
    var categoryListView = findViewById<ListView>(R.id.categoryListView)

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)


    }
}
/*
* Não vai dar certo com a nossa recicle view, mas pode ser utíl em outra situação:
categoryListView.setOnItemClickListener { adapterView, view, i, l ->
            val category = DataService.categories[i]
            Toast.makeText(this,"you clicked on the ${category.title} cell", Toast.LENGTH_SHORT)
        }
*  */