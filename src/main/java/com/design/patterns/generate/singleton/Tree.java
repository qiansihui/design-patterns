package com.design.patterns.generate.singleton;

/**
 * @author qianqian.sun 2018/5/14
 * 描述：双重检查锁
 * 懒加载，线程安全
 */
public class Tree {
    private volatile static Tree tree;

    private Tree() {
    }

    public static Tree getTree() {
        if (null == tree) {
            synchronized (Tree.class) {
                if (null == tree) {
                    tree = new Tree();
                }
            }
        }
        return tree;
    }
}
