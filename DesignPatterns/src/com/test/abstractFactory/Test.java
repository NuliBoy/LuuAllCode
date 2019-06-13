package com.test.abstractFactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.getArticle().produce();
        courseFactory.getVideo().produce();
    }
}
