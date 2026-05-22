package com.streaming.engine.notification;

import com.streaming.engine.playlist.Song;

public class PushNotificationService implements AudioEngineObserver {
    @Override
    public void onNewSongReleased(Song song) {
        System.out.println("[PUSH NOTIFICATION] Sending alert to followers: New track '" 
                           + song.getTitle() + "' by " + song.getArtist() + " is out now!");
    }
}