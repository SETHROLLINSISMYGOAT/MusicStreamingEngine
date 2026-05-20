package com.streaming.engine.playback;

import com.streaming.engine.playlist.Song;

public class PlaybackEngine {
    private PlaybackState currentState;
    private Song currentSong;

    public PlaybackEngine() {
       
        this.currentState = new StoppedState();
        this.currentSong = null;
    }

    void setState(PlaybackState state) {
        this.currentState = state;
    }

    void setCurrentSong(Song song) {
        this.currentSong = song;
    }

    public Song getCurrentSong() {
        return currentSong;
    }

    public String getCurrentStateName() {
        return currentState.getClass().getSimpleName();
    }

    
    public void play(Song song) {
        currentState.play(this, song);
    }

    public void pause() {
        currentState.pause(this);
    }

    public void stop() {
        currentState.stop(this);
    }
}