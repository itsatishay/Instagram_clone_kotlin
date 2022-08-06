package com.kotlin.instagram_clone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.people_stories_circle.view.*


class StoriesAdapter(
    private val stories : MutableList<StoriesData>
) : RecyclerView.Adapter<StoriesAdapter.StoriesViewHolder>() {
    class StoriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoriesViewHolder {
        return StoriesViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.people_stories_circle,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: StoriesViewHolder, position: Int) {
        val story = stories[position]
        holder.itemView.apply {
            personStoryName.text = story.personName
        }
    }

    override fun getItemCount(): Int {
        return stories.size
    }

}