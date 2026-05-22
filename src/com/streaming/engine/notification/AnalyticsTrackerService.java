package com.streaming.engine.notification;

import com.streaming.engine.playlist.Song;

public class AnalyticsTrackerService implements AudioEngineObserver {
    @Override
    public void onNewSongReleased(Song song) {
        System.out.println("[ANALYTICS] Logging event: Track ID " + song.getId() 
                           + " successfully indexed into recommendation matrices.");
    }
}