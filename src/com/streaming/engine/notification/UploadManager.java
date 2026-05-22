package com.streaming.engine.notification;

import com.streaming.engine.playlist.Song;
import java.util.ArrayList;
import java.util.List;
public class UploadManager{
    private final List<AudioEngineObserver> observers = new ArrayList<>();
    public void attach(AudioEngineObserver observer){
        observers.add(observer);

    }
    public void detach(AudioEngineObserver observer){
        observers.remove(observer);

    }
    public void releasedSong(Song newSong){
        notifyObservers(newSong);
    }
    public void notifyObservers(Song song){
        for(AudioEngineObserver observer : observers){
            observer.onNewSongReleased(song);
        }

    }
}