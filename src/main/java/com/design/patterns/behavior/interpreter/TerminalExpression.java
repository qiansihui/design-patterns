package com.design.patterns.behavior.interpreter;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String content) {
        return content.contains(data);
    }
}
