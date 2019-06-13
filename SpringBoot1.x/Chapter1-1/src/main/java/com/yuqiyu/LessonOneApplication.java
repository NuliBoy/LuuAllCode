package com.yuqiyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.yuqiyu.lessonOne.controller"})
public class LessonOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(LessonOneApplication.class, args);
	}
}
