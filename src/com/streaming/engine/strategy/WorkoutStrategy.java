package com.streaming.engine.strategy;

import java.util.List;
import java.util.stream.Collectors;

public class WorkoutStrategy implements RecommendationStrategy1 {
    @Override
    public List<Song1> filterTracks(List<Song1> fullCatalog) {
        System.out.println("[ALGORITHM] Applying High-Energy Workout Filter (BPM >= 120)...");
        return fullCatalog.stream()
                .filter(song -> song.getBpm() >= 120)
                .collect(Collectors.toList());
    }
}