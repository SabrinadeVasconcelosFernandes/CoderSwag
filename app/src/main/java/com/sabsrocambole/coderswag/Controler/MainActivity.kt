package com.sabsrocambole.coderswag.Controler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import com.sabsrocambole.coderswag.Adapters.CategoryAdapter
import com.sabsrocambole.coderswag.Model.Category
import com.sabsrocambole.coderswag.R
import com.sabsrocambole.coderswag.Services.DataService
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    //var categoryName = findViewById<TextView>(R.id.catergoryName)
    var categoryListView = findViewById<ListView>(R.id.categoryListView)
    lateinit var adapter : CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,DataService.categories)

        categoryListView.adapter = adapter
    }
}