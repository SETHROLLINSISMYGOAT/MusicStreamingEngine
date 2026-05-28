package com.streaming.engine.strategy;

public class Song1 {
    private final int id;
    private final String title;
    private final String artist;
    private final int bpm; // Beats Per Minute (Tempo)
    private final int playCount; // Popularity metric

    public Song1(int id, String title, String artist, int bpm, int playCount) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
        this.playCount = playCount;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public int getBpm() { return bpm; }
    public int getPlayCount() { return playCount; }
}