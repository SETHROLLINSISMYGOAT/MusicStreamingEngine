package com.streaming.engine.strategy;


import java.util.List;
import java.util.stream.Collectors;

public class TrendingStrategy implements RecommendationStrategy1 {
    @Override
    public List<Song1> filterTracks(List<Song1> fullCatalog) {
        System.out.println("[ALGORITHM] Applying Trending Filter (Play Count > 50,000)...");
        return fullCatalog.stream()
                .filter(song -> song.getPlayCount() > 50000)
                .collect(Collectors.toList());
    }
}