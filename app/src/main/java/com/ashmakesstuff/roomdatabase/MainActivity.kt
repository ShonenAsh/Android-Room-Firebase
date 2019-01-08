package com.ashmakesstuff.roomdatabase

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var Fab: FloatingActionButton
    private val TAG = "MainActivity"
    private lateinit var recyclerView: androidx.recyclerview.widget.RecyclerView
    private lateinit var adapter: androidx.recyclerview.widget.RecyclerView.Adapter<UserAdapter.ViewHolder>
    private var users: ArrayList<User> = java.util.ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = recycler_view
        recyclerView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)
        var user = User(1, "Ashish", "Magadum", "email@email.com")
        users.add(user)
        adapter = UserAdapter(users)
        recyclerView.adapter = adapter
        Fab = fab
        Fab.setOnClickListener {
            startActivity(Intent(this@MainActivity, CreateUser::class.java))
        }
    }
}