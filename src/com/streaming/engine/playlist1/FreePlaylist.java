package com.streaming.engine.playlist1;

public class FreePlaylist extends Playlist1 {
    @Override
    public void configureRules() {
        System.out.println("[FREE PLAYLIST] Initializing: Caps set to 10 songs max. Mandatory ad tokens injected every 3 tracks.");
    }
}