package com.sabsrocambole.coderswag.Controler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.sabsrocambole.coderswag.Model.Category
import com.sabsrocambole.coderswag.R
import com.sabsrocambole.coderswag.Services.DataService

class MainActivity : AppCompatActivity() {

    var categoryListView = findViewById<ListView>(R.id.categoryListView)
    lateinit var adapter : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this,
        android.R.layout.simple_list_item_1,
        DataService.categories)

        categoryListView.adapter = adapter
    }
}