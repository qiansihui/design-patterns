package com.design.patterns.generate.builder;

/**
 * @author qianqian.sun 2018/5/14
 * 描述：
 */
public class App {
    public static void main(String[] args) {
        Student student = StudentBuilder.create()
                .setName("xiao ming")
                .setAge(17)
                .setSex(true)
                .build();
        System.out.println(student);
    }
}
