package com.streaming.engine.notification;

import com.streaming.engine.playlist.Song;

public interface AudioEngineObserver {
    // This method gets invoked automatically whenever the publisher broadcasts
    void onNewSongReleased(Song song);
}