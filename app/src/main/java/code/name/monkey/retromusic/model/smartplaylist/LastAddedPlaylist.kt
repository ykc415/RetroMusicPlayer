package code.name.monkey.retromusic.model.smartplaylist

import code.name.monkey.retromusic.App
import code.name.monkey.retromusic.R
import code.name.monkey.retromusic.model.Song
import kotlinx.android.parcel.Parcelize

@Parcelize
class LastAddedPlaylist :
    AbsSmartPlaylist(App.getContext().getString(R.string.last_added), R.drawable.ic_library_add) {
    override fun songs(): List<Song> {
        return lastAddedRepository.recentSongs()
    }
}