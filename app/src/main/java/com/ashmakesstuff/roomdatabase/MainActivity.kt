package com.ashmakesstuff.roomdatabase
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var fab :FloatingActionButton
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fab = findViewById(R.id.FloatingActionButton)
        fab.setOnClickListener {
            startActivity(Intent(this@MainActivity, CreateUser::class.java))
        }
    }
}