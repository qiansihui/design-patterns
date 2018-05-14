package com.design.patterns.structure.adapter;

/**
 * @author qianqian.sun 2018/5/14
 * 描述：
 */
public class VlcMediaPlayer implements AdvanceMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("VlcMediaPlay::playVlc," + fileName);
    }

    public void playMp4(String fileName) {

    }
}
