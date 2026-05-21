package com.streaming.engine.recommendation;
import java.util.*;
import com.streaming.engine.playlist.Song;



public class GenreBasedStrategy implements RecommendationStrategy {
    @Override
    public List<Song> recommend(int userId) {
        System.out.println("Running Genre-Based Strategy (Matching User History)...");
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(301, "Tum Hi Ho", "Arijit Singh", 260));
        songs.add(new Song(302, "Channa Mereya", "Arijit Singh", 289));
        return songs;
    }
    
}
