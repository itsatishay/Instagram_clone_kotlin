package com.kotlin.instagram_clone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var storiesAdapter: StoriesAdapter
    private lateinit var postsAdapter: PostsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val stories = listNames()
        storiesAdapter = StoriesAdapter(stories)
        storiesList.adapter = storiesAdapter
        storiesList.setLayoutManager(
            LinearLayoutManager(
                this,
                LinearLayoutManager.HORIZONTAL,
                false
            )
        )
        val posts = listPosts()
        postsAdapter = PostsAdapter(posts)
        postsList.adapter = postsAdapter
        postsList.layoutManager = LinearLayoutManager(this)
    }

    fun listNames() : MutableList<StoriesData>{
        val stories = mutableListOf<StoriesData>()
        for(i in 1..10){
            val story = StoriesData("", "Sankar Raj")
            stories.add(story)
        }
        return stories
    }

    fun listPosts() : MutableList<PostsData>{
        val posts = mutableListOf<PostsData>()
        for(i in 1..10){
            val post = PostsData("", "Sankar Raj","","this is my new pic")
            posts.add(post)
        }
        return posts
    }

   /* override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.bottom_nav_menu, menu)
        var homeMenuItem : MenuItem
        if (menu != null) {
            homeMenuItem = menu.findItem(R.id.homeBottomNav)
        }

        return true
    }*/

}


