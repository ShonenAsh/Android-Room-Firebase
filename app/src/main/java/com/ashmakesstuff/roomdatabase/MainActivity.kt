package com.ashmakesstuff.roomdatabase

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var Fab: FloatingActionButton
    private val TAG = "MainActivity"
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RecyclerView.Adapter<UserAdapter.ViewHolder>
    private lateinit var users: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = recycler_view
        recyclerView.layoutManager = LinearLayoutManager(this)
        users.add("John")
        users.add("Lara")
        users.add("Smith")
        adapter = UserAdapter(users)
        recyclerView.adapter = adapter
        Fab = fab
        Fab.setOnClickListener {
            startActivity(Intent(this@MainActivity, CreateUser::class.java))
        }
    }
}