package com.streaming.engine.strategy;


import java.util.List;

public interface RecommendationStrategy1 {
   
    List<Song1> filterTracks(List<Song1> fullCatalog);
}