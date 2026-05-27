package com.streaming.engine.observer;
import com.streaming.engine.playlist.Song;
public  interface AudioObserver {
    void onNewTrackPublished(String playlistName,Song song);

    
}
