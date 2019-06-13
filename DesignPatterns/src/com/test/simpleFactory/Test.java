package com.test.simpleFactory;

import com.test.exception.CourseErrorException;

public class Test {
    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if(null == video){
//            throw new CourseErrorException("课程编码有误");
//        }
//        video.produce();
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(PythonVideo.class);
        if(null == video){
            throw new CourseErrorException("class类有误");
        }
        video.produce();
    }
}
