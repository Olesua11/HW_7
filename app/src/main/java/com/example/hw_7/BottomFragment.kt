package com.example.hw_7

import PlaylistAdapter
import Song
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BottomFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var playlistAdapter: PlaylistAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_bottom, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(activity)

        val songs = getSampleSongs()
        playlistAdapter = PlaylistAdapter(songs) { selectedSong ->
            val intent = Intent(activity, SongDetailActivity::class.java)
            intent.putExtra("song_title", selectedSong.title)
            startActivity(intent)
        }

        recyclerView.adapter = playlistAdapter
        return view
    }

    private fun getSampleSongs(): List<Song> {
        return listOf(
            Song("Smells Like Teen Spirit", "Nirvana", "05:01"),
            Song("Come As You Are", "Nirvana", "03:41"),
            Song("The Man Who Sold The World", "Nirvana", "03:47"),
            Song("Rape Me (OST Выкрутасы)", "Nirvana", "02:49"),
            Song("Heart Shaped Box", "Nirvana", "04:40"),
            Song("Lithium", "Nirvana", "04:17"),
            Song("Rape Me", "Nirvana", "02:50"),
            Song("In Bloom", "Nirvana", "04:14"),
            Song("About A Girl", "Nirvana", "02:47"),
            Song("Dumb", "Nirvana", "02:32")

        )
    }
}
