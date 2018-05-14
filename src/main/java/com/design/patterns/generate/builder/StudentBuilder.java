package com.design.patterns.generate.builder;

/**
 * @author qianqian.sun 2018/5/14
 * 描述：
 */
public class StudentBuilder {
    private Student student = new Student();

    private StudentBuilder() {
    }

    public static StudentBuilder create() {
        return new StudentBuilder();
    }

    public StudentBuilder setName(String name) {
        student.setName(name);
        return this;
    }

    public StudentBuilder setAge(Integer age) {
        student.setAge(age);
        return this;
    }

    public StudentBuilder setSex(Boolean sex) {
        student.setSex(sex);
        return this;
    }

    public Student build() {
        return student;
    }
}
