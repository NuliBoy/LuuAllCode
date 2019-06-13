package com.test.Dimit;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public  void checkNum(){
        List<Course> courses = new ArrayList<>();
        for (int i=0;i < 10 ; i++){
           courses.add(new Course()) ;
        }
        System.out.println("course数量是："+courses.size());
    }
}
