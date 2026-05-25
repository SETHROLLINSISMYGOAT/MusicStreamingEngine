package com.streaming.engine.adapter;

import com.streaming.engine.playlist.Song;

public class SoundCloudAdapter implements NativeAudioPlayer {
   
    private final LegacySoundCloudService externalService;

    public SoundCloudAdapter(LegacySoundCloudService externalService) {
        this.externalService = externalService;
    }

    @Override
    public void playNativeTrack(Song song) {
        System.out.println("[ADAPTER] Converting native Song token to Third-Party format...");
        
      
        ThirdPartyTrack convertedTrack = new ThirdPartyTrack(song.getTitle(), song.getArtist());
     
        externalService.renderExternalAudio(convertedTrack);
    }
}