package com.streaming.engine.playlist;
import java.util.*;

public class Playlist {
    private final String name;
    private final List<Song> tracks; 
    public Playlist(String name){
        if(name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Playlist name cannot be empty or blank.");
        }
        this.name=name;
        this.tracks=new ArrayList<>();

    }
    public void addSong(Song song){
        if(song==null){
            throw new IllegalArgumentException("Cannot append a null song reference to this playlist.");
        }
        tracks.add(song);
    }
    public String getName() { return name; }
    public List<Song> getTracks(){
        return Collections.unmodifiableList(tracks);
    }
    public int getTrackCount(){
        return tracks.size();
    }
}
