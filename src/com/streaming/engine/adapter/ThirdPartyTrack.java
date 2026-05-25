package com.streaming.engine.adapter;

public class ThirdPartyTrack {
    private final String musicTitle;
    private final String creator;
    public ThirdPartyTrack(String musicTitle, String creator) {
       
        this.musicTitle = musicTitle;
        this.creator = creator;
    }
    public String getMusicTitle() {
        return musicTitle;
    }
    public String getCreator() {
        return creator;
    }
    
}
