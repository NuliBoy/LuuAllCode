package com.test.simpleFactory;

public class PythonVideo implements Video {

    @Override
    public void produce() {
        System.out.println("python 视频");
    }
}
