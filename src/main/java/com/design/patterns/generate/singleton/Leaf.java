package com.design.patterns.generate.singleton;

/**
 * @author qianqian.sun 2018/5/14
 * 描述：世界上每一片叶子都是独一无二的
 * 饿汉式， 在类装载时就实例化
 */
public class Leaf {
    private static Leaf leaf = new Leaf();

    private Leaf() {
    }

    public static Leaf getLeaf() {
        return leaf;
    }

    public void leave() {
        System.out.println("I am going");
    }
}
