package com.streaming.engine.playlist1;

public class PlaylistFactory {
    public static Playlist1 createPlaylist(String type){
        if(type==null) return null;
        Playlist1 playlist;
        switch(type.toLowerCase()){
            case "free":
                playlist=new FreePlaylist();
                break;
            case "premium":
                playlist=new PremiumPlaylist();
                break;
            default:
                throw new IllegalArgumentException("Unsupported playlist type: "+type);
        }
        playlist.configureRules();
        return playlist;
    }
}
