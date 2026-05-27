package com.streaming.engine.observer;
import com.streaming.engine.playlist.Song;

public class AnalyticsEngine implements AudioObserver {

    @Override
    public void onNewTrackPublished(String playlistName, Song song) {
        System.out.println("[ANALYTICS] Logged track release event. Song ID: " 
                           + song.getId() + " at timestamp " + System.currentTimeMillis());
    }
    
}
