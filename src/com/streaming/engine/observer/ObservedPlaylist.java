package com.streaming.engine.observer;
import com.streaming.engine.playlist.Song;
import java.util.ArrayList;
import java.util.List;

public class ObservedPlaylist {
    private final String playlistName;
    private final List<Song> trackList;
    private final List<AudioObserver> subscribers;
    public ObservedPlaylist(String playlistName) {
        this.playlistName = playlistName;
        this.trackList = new ArrayList<>();
        this.subscribers = new ArrayList<>();
    }
    public void subscribe(AudioObserver observer) {
        if (observer != null && !subscribers.contains(observer)) {
            subscribers.add(observer);
        }
    }
    public void unsubscribe(AudioObserver observer) {
        subscribers.remove(observer);
    }
    public void releaseNewTrack(Song song) {
        if (song != null) {
            trackList.add(song);
            notifyAllObservers(song);
        }
    }
    private void notifyAllObservers(Song song) {
        for (AudioObserver observer : subscribers) {
            observer.onNewTrackPublished(playlistName, song);
        }
    }
}
