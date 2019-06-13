package com.test.di;

import com.test.openAndclose.Icourse;

public class Geely {
    private  Icourses icourses;

    public  void setStudyCourse(Icourses icourses){
        this.icourses = icourses;
    }
    public void studyCourseOnImooc(){

        icourses.studyCourse();
    }
}
