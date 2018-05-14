package com.design.patterns.structure.adapter;

/**
 * @author qianqian.sun 2018/5/14
 * 描述：
 */
public class Mp4MediaPlayer implements AdvanceMediaPlayer {
    public void playVlc(String fileName) {

    }

    public void playMp4(String fileName) {
        System.out.println("Mp4Media::playMp4," + fileName);
    }
}
