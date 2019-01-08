package com.ashmakesstuff.roomdatabase

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class UserAdapter(private var users: ArrayList<User>) : androidx.recyclerview.widget.RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {
        var firstName: TextView = itemView.findViewById(R.id.first_name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, pos: Int) {
        holder.firstName.text = users[pos].firstName
    }

    override fun getItemCount(): Int = users.size

}
