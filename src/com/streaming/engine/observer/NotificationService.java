package com.streaming.engine.observer;

import com.streaming.engine.playlist.Song;

public class NotificationService implements AudioObserver {

    @Override
    public void onNewTrackPublished(String playlistName, Song song) {
        System.out.println("[NOTIFICATION] Email sent to subscribers: '" 
                           + song.getArtist() + "' dropped a new track in '" + playlistName + "'!");
    }
    
}
