package com.test.bulider;

public class Course {


    private  String cousrseName;
    private String coursePPT;
    private  String courseVideo;
    private String courseArticle;


    public Course(CourseBulider courseBulider){

        this.courseArticle = courseBulider.courseArticle;
        this.coursePPT = courseBulider.coursePPT;
        this.courseVideo  = courseBulider.courseVideo;
        this.cousrseName = courseBulider.courseName;

    }
    @Override
    public String toString() {
        return "Course{" +
                "cousrseName='" + cousrseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                '}';
    }


    public static class CourseBulider{

        private  String courseName;
        private String coursePPT;
        private  String courseVideo;
        private String courseArticle;

        public CourseBulider buildCourseName(String courseName){

            this.courseName = courseName;
            return this;

        }

        public CourseBulider buildCoursePPT(String coursePPT){

            this.coursePPT = coursePPT;
            return this;

        }
        public CourseBulider buildCourseVideo(String courseVideo){

            this.courseVideo = courseVideo;
            return this;

        }
        public CourseBulider buildCourseArticle(String courseArticle){

            this.courseArticle = courseArticle;
            return this;

        }

        public  Course build(){

            return new Course(this);
        }

    }
}
