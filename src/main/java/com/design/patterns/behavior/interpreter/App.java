package com.design.patterns.behavior.interpreter;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式，它属于行为型模式。
 * 这种模式实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。
 * 就是拿表达式去处理内容，判断是否符合该表达式条件
 */
public class App {
    private static Expression getMarriedWomanExpression() {
        Expression name = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(name, married);
    }

    public static void main(String[] args) {
        Expression isMarriedWoman = getMarriedWomanExpression();

        // 宛如智障
        System.out.println(isMarriedWoman.interpret("Married Julie"));

    }
}
