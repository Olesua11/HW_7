package com.example.hw_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



import com.example.hw_7.databinding.ActivitySongDetailBinding

class SongDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySongDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySongDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val songTitle = intent.getStringExtra("song_title")

        binding.textViewSongDetail.text = "Now playing: $songTitle"
    }
}
