package com.streaming.engine.recommendation;
import java.util.*;
import com.streaming.engine.playlist.Song;
public interface RecommendationStrategy {
    List<Song> recommend(int userId);
    

    
}
