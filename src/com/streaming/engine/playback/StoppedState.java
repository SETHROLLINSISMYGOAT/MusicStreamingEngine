package com.streaming.engine.playback;


import com.streaming.engine.playlist.Song;

public class StoppedState implements PlaybackState {
    @Override
    public void play(PlaybackEngine context, Song song) {
        System.out.println("Starting playback: " + song.getTitle());
        context.setCurrentSong(song);
        context.setState(new PlayingState()); // Transition to Playing State
    }

    @Override
    public void pause(PlaybackEngine context) {
        System.out.println("Cannot pause. The player is currently stopped.");
    }

    @Override
    public void stop(PlaybackEngine context) {
        System.out.println("Player is already in stopped state.");
    }
}
