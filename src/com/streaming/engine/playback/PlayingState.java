

package com.streaming.engine.playback;

import com.streaming.engine.playlist.Song;

public class PlayingState implements PlaybackState {
    @Override
    public void play(PlaybackEngine context, Song song) {
        if (context.getCurrentSong() != null && context.getCurrentSong().getId() == song.getId()) {
            System.out.println("Track '" + song.getTitle() + "' is already actively playing.");
        } else {
            System.out.println("Switching track to: " + song.getTitle());
            context.setCurrentSong(song);
        }
    }

    @Override
    public void pause(PlaybackEngine context) {
        System.out.println("Pausing: " + context.getCurrentSong().getTitle());
        context.setState(new PausedState()); // Transition to Paused State
    }

    @Override
    public void stop(PlaybackEngine context) {
        System.out.println("Stopping playback for: " + context.getCurrentSong().getTitle());
        context.setCurrentSong(null);
        context.setState(new StoppedState()); // Transition to Stopped State
    }
}
