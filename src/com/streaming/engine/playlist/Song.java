package com.streaming.engine.playlist;
public class Song{
    private final int id;
    private final String title;
    private final String artist;
    private final int durationInSeconds;
    public Song(int id,String title,String artist,int durationInSeconds){
        if(title==null || artist==null){
            throw new IllegalArgumentException("Song title and artist fields cannot be null.");
        
        }
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
        
    }
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public int getDurationInSeconds() { return durationInSeconds; }
    @Override
    public String toString() {
        return "Song{" + "id=" + id + ", title='" + title + '\'' + ", artist='" + artist + '\'' + '}';
    }
    

    
}
