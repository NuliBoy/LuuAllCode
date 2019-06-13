package com.test.simpleFactory;

public class VideoFactory {

//    Video  getVideo(String video){
//
//
//
//        if ("java".equals(video)){
//
//            return new JavaVideo();
//        }
//        if ("python".equals(video)){
//
//            return new PythonVideo();
//        }
//
//        return null;
//
//
//    }
//
Video  getVideo(Class<?> classOfVideo){
        Video video = null;
    try {
        video = (Video)classOfVideo.newInstance();
    } catch (InstantiationException e) {
        e.printStackTrace();
    } catch (IllegalAccessException e) {
        e.printStackTrace();
    }

    return video;


}



}
