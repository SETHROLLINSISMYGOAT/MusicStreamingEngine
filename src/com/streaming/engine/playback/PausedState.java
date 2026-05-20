package com.streaming.engine.playback;
import com.streaming.engine.playlist.Song;
public class PausedState implements PlaybackState {
    @Override
    public void play(PlaybackEngine context,Song song){
        System.out.println("Resuming playback: " + context.getCurrentSong().getTitle());
        context.setState(new PlayingState());
    }
    @Override
    public void pause(PlaybackEngine context) {
        System.out.println("Player is already paused.");
    }
    @Override
    public void stop(PlaybackEngine context) {
        System.out.println("Stopping playback from paused state.");
        context.setCurrentSong(null);
        context.setState(new StoppedState()); // Transition to Stopped State
    }
    
}
