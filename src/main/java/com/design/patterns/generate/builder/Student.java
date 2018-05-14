package com.design.patterns.generate.builder;

/**
 * @author qianqian.sun 2018/5/14
 * 描述：
 */
public class Student {
    private String name;
    private Integer age;
    private Boolean sex;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
