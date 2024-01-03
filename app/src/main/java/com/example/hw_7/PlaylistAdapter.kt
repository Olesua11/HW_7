import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_7.R

class PlaylistAdapter(private val songs: List<Song>, private val onItemClick: (Song) -> Unit) : RecyclerView.Adapter<PlaylistAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                onItemClick(songs[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_song, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentSong = songs[position]
        val itemNumber = position + 1
        holder.itemView.findViewById<TextView>(R.id.textViewTitle).text = "$itemNumber. ${currentSong.title}"
        holder.itemView.findViewById<TextView>(R.id.textViewArtist).text = currentSong.artist
        holder.itemView.findViewById<TextView>(R.id.textViewDuration).text = currentSong.duration
    }

    override fun getItemCount(): Int {
        return songs.size
    }
}
