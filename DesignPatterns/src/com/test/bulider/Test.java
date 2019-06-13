package com.test.bulider;

public class Test {
    public static void main(String[] args) {
        Course  course = new Course.CourseBulider().buildCourseArticle("java艺术").buildCourseName("java设计模式")
                .buildCoursePPT("Java课件").buildCourseVideo("Java视频").build();

        System.out.println(course);
    }
}
