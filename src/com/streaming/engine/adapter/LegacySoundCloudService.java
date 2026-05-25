package com.streaming.engine.adapter;

public class LegacySoundCloudService {
   
    public void renderExternalAudio(ThirdPartyTrack track) {
        System.out.println("[SOUNDCLOUD CLOUD-STREAM] Rendering: " 
                           + track.getMusicTitle() + " by " + track.getCreator());
    }
}