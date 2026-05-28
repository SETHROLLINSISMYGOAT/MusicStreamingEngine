package com.streaming.engine.strategy;

import java.util.List;
public class RecommendationEngine1 {
    private RecommendationStrategy1 currentStrategy;

   

    public void setStrategy(RecommendationStrategy1 strategy) {
        this.currentStrategy = strategy;
    }

    public void generateUserFeed(List<Song1> platformCatalog) {
        if (currentStrategy == null) {
            System.out.println("No recommendation strategy set. Unable to generate feed.");
            return;
        }
        List<Song1> recommendedTracks = currentStrategy.filterTracks(platformCatalog);
       
        for (Song1 song : recommendedTracks) {
            System.out.println("   - " + song.getTitle() + " by " + song.getArtist());
        }
        System.out.println();
    }
    
}
