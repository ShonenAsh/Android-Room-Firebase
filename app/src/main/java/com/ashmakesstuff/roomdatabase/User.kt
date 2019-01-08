package com.ashmakesstuff.roomdatabase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
        @PrimaryKey var id: Int,
        var firstName: String,
        var lastName: String,
        var email: String
) {
    override fun toString(): String {
        return "User(id=$id, firstName='$firstName', lastName='$lastName', email='$email')"
    }
}