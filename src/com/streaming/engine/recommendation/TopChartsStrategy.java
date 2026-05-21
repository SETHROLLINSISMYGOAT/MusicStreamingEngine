package com.streaming.engine.recommendation;

import com.streaming.engine.playlist.Song;
import java.util.ArrayList;
import java.util.List;

public class TopChartsStrategy implements RecommendationStrategy {
    @Override
    public List<Song> recommend(int userId) {
        System.out.println("Running Top Charts Strategy (Trending India Top 50)...");
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(401, "Paisa Pulse Beats (Remix)", "Siddhant", 150));
        return songs;
    }
}