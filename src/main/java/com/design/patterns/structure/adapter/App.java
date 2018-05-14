package com.design.patterns.structure.adapter;

/**
 * @author qianqian.sun 2018/5/14
 * 描述：适配器
 */
public class App {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(MediaType.MP3, "大海.mp3");
        audioPlayer.play(MediaType.MP4, "大海.mp4");
        audioPlayer.play(MediaType.VLC, "大海.vlc");
    }
}
