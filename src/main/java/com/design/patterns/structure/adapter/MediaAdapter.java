package com.design.patterns.structure.adapter;

/**
 * @author qianqian.sun 2018/5/14
 * 描述：
 */
public class MediaAdapter implements MediaPlayer {
    private AdvanceMediaPlayer mediaPlayer;

    public MediaAdapter(MediaType mediaType) {
        if (MediaType.VLC == mediaType) {
            mediaPlayer = new VlcMediaPlayer();
        } else if (MediaType.MP4 == mediaType) {
            mediaPlayer = new Mp4MediaPlayer();
        }
    }

    public void play(MediaType mediaType, String file) {
        if (MediaType.VLC == mediaType) {
            mediaPlayer.playVlc(file);
        } else if (MediaType.MP4 == mediaType) {
            mediaPlayer.playMp4(file);
        }
    }
}
