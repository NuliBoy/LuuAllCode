package com.test.factory;

import com.test.exception.CourseErrorException;

public class Test {
    public static void main(String[] args) {
        JavaFactory javaFactory = new JavaFactory();
        Video video =  javaFactory.getVideo();
        video.produce();
    }
}
