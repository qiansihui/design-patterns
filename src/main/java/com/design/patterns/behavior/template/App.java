package com.design.patterns.behavior.template;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板。
 * 它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。这种类型的设计模式属于行为型模式。
 */
public class App {
    public static void main(String[] args) {
        Game game = new MarioGame();
        game.play();
    }
}
