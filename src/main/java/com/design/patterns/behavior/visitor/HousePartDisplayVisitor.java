package com.design.patterns.behavior.visitor;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class HousePartDisplayVisitor implements HousePartVisitor {
    @Override
    public void visit(Bedroom bedroom) {
        System.out.println("displaying bedroom");
    }

    @Override
    public void visit(Bathroom bathroom) {
        System.out.println("displaying bathroom");
    }

    @Override
    public void visit(House house) {
        System.out.println("displaying house");
    }
}
