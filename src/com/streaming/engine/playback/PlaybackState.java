package com.streaming.engine.playback;

import com.streaming.engine.playlist.Song;

public interface PlaybackState {
    void play(PlaybackEngine context, Song song);
    void pause(PlaybackEngine context);
    void stop(PlaybackEngine context);
}
