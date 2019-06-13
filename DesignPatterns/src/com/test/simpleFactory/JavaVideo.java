package com.test.simpleFactory;

public class JavaVideo implements Video {
    @Override
    public void produce() {
        System.out.println("java视频");
    }
}
