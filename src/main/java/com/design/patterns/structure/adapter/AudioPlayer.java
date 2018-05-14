package com.design.patterns.structure.adapter;

/**
 * @author qianqian.sun 2018/5/14
 * 描述：
 */
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    public void play(MediaType mediaType, String file) {
        switch (mediaType) {
            case MP3:
                System.out.println("play mp3");
                return;
            case MP4:
            case VLC:
                // 使用适配器，避免AdvanceMediaPlayer与MediaPlay耦合
                mediaAdapter = new MediaAdapter(mediaType);
                mediaAdapter.play(mediaType, file);
                return;
            default:
                System.out.println("not support");

        }

    }
}
