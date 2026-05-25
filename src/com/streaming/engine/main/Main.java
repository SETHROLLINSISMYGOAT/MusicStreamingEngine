package com.streaming.engine.main;
import java.util.*;
import com.streaming.engine.playlist1.Playlist1;

import com.streaming.engine.notification.AnalyticsTrackerService;
import com.streaming.engine.notification.AudioEngineObserver;
import com.streaming.engine.notification.PushNotificationService;
import com.streaming.engine.notification.UploadManager;
import com.streaming.engine.playback.PlaybackEngine;
import com.streaming.engine.playlist.Playlist;
import com.streaming.engine.playlist.Song;
import com.streaming.engine.playlist1.PlaylistFactory;
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

        // Day 4
        UploadManager uploadManager = new UploadManager();
        AudioEngineObserver push = new PushNotificationService();
        AnalyticsTrackerService analytics = new AnalyticsTrackerService();
        uploadManager.attach(push);
        uploadManager.attach(analytics);
        Song newTrack = new Song(601, "Unaddictd Anthems", "Siddhant", 195);
        uploadManager.releasedSong((newTrack));
        uploadManager.detach((analytics));
        Song secondTrack = new Song(602, "Coding Sprints", "Tech Team", 220);
        uploadManager.releasedSong(secondTrack);

        // day 5
        System.out.println("=== Day 5: Factory Method Pattern Verification ===\n");

        Song track2Song = new Song(701, "Code Alchemy", "Siddhant", 185);

        // 1. Request a Free Playlist from the factory
        System.out.println("--- Scenario 1: Free Tier Session Detected ---");
        Playlist1 userPlaylist = PlaylistFactory.createPlaylist("FREE");
        userPlaylist.addSong(track2Song);
        
        // 2. Request a Premium Playlist from the factory
        System.out.println("\n--- Scenario 2: Premium Tier Upgrade Event ---");
        Playlist1 premiumPlaylist = PlaylistFactory.createPlaylist("PREMIUM");
        premiumPlaylist.addSong(track2Song);
        




    }
    
}
