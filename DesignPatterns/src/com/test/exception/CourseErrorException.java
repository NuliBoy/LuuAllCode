package com.test.exception;

public class CourseErrorException extends NullPointerException {

    public CourseErrorException(String s) {
        super(s);
    }
}
