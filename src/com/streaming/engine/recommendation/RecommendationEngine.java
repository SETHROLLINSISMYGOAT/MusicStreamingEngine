package com.streaming.engine.recommendation;
import com.streaming.engine.playlist.Song;
import java.util.*;
public class RecommendationEngine {
    private RecommendationStrategy currenStrategy;
    public RecommendationEngine(RecommendationStrategy strategy)
    {
        this.currenStrategy=strategy;
    }
    public void setStrategy(RecommendationStrategy strategy){
        this.currenStrategy=strategy;
    }
    public  List<Song> generatePlaylist(int userId){
        return currenStrategy.recommend(userId);
        
    }

    
}
