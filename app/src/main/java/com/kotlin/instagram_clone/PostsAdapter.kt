package com.kotlin.instagram_clone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.posts_widget.view.*

class PostsAdapter(
    private val posts : MutableList<PostsData>
) : RecyclerView.Adapter<PostsAdapter.PostsViewHolder>() {
    class PostsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
        return PostsAdapter.PostsViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.posts_widget,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
        val post = posts[position]
        holder.itemView.apply {
            postPersonName.text = post.personName
            postPersonNameBody.text = post.personName
            postBodyDescription.text = post.postBodyDes
        }    }

    override fun getItemCount(): Int {
        return posts.size
    }
}