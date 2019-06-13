package com.test.di;

public class TestOfDi {
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setStudyCourse(new PythonCourse());
        geely.studyCourseOnImooc();

        geely.setStudyCourse(new JavaCOurse());
        geely.studyCourseOnImooc();

        geely.setStudyCourse(new JsCourse());
        geely.studyCourseOnImooc();
    }
}
