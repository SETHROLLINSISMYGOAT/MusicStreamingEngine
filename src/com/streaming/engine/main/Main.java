package com.streaming.engine.main;

import com.streaming.engine.playlist.Playlist;
import com.streaming.engine.playlist.Song;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Day 1: Streaming Engine Core Validation ===");
        Song track1 = new Song(101, "Paisa Pulse Lo-Fi", "Siddhant", 180);
        Song track2 = new Song(102, "Clean Code Symphony", "Architect", 240);
        Playlist mix = new Playlist("SDE-1 Launch Mix");
        mix.addSong(track1);
        mix.addSong(mix.getTracks().isEmpty() ? track1 : track2);
        System.out.println("Processing Playlist: " + mix.getName());
        System.out.println("Total Track Count: " + mix.getTrackCount());
        for (Song track : mix.getTracks()) {
            System.out.println(" -> Stream Buffer Target: " + track.getTitle() + " by " + track.getArtist());
        }


    }
    
}
