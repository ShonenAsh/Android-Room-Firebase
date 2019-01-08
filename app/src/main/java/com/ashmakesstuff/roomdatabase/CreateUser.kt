package com.ashmakesstuff.roomdatabase

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_create_user.*

class CreateUser : AppCompatActivity() {
    lateinit var firstName: EditText
    lateinit var lastName: EditText
    lateinit var email: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            // TODO() : Save to database
            Snackbar.make(view, "This should save your data", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        firstName = findViewById(R.id.editTextFirstName)
        lastName = findViewById(R.id.editTextLastName)
        email = findViewById(R.id.editTextEmail)
    }

}
