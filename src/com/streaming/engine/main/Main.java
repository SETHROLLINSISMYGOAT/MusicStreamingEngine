package com.streaming.engine.main;
import java.util.*;
import com.streaming.engine.playback.PlaybackEngine;
import com.streaming.engine.playlist.Playlist;
import com.streaming.engine.playlist.Song;
import com.streaming.engine.recommendation.GenreBasedStrategy;
import com.streaming.engine.recommendation.RecommendationEngine;
import com.streaming.engine.recommendation.TopChartsStrategy;

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
        System.out.println("=== Day 2: Playback State Machine Verification ===\n");

        // 1. Prepare sample tracks
        Song track = new Song(101, "Paisa Pulse Beats", "Siddhant", 180);

        // 2. Initialize the engine
        PlaybackEngine engine = new PlaybackEngine();
        System.out.println("Initial State: " + engine.getCurrentStateName());

        // 3. Fire actions to test state transitions
        System.out.println("\n--- Action: Try to pause while stopped ---");
        engine.pause();

        System.out.println("\n--- Action: Play Track ---");
        engine.play(track);
        System.out.println("Current State: " + engine.getCurrentStateName());

        System.out.println("\n--- Action: Play Same Track Again ---");
        engine.play(track);

        System.out.println("\n--- Action: Pause Track ---");
        engine.pause();
        System.out.println("Current State: " + engine.getCurrentStateName());

        System.out.println("\n--- Action: Resume Track ---");
        engine.play(track);
        System.out.println("Current State: " + engine.getCurrentStateName());

        System.out.println("\n--- Action: Stop Track ---");
        engine.stop();
        System.out.println("Current State: " + engine.getCurrentStateName());
        int userId=107;
        RecommendationEngine engine1 = new RecommendationEngine(new TopChartsStrategy());
        List<Song> recommendation = engine1.generatePlaylist(userId);
        
        engine1.setStrategy(new GenreBasedStrategy());
        engine1.generatePlaylist(userId);


    }
    
}
