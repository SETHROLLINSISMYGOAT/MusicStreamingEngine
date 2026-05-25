package com.streaming.engine.playlist1;

import com.streaming.engine.playlist.Song;
import java.util.List;
import java.util.ArrayList;

public abstract class Playlist1 {
    protected List<Song> tracks = new ArrayList<>();
    
  
    public abstract void configureRules();
    
    public void addSong(Song song) {
        tracks.add(song);
        System.out.println("Added '" + song.getTitle() + "' to the playlist.");
    }
    
    public int getTrackCount() {
        return tracks.size();
    }
}