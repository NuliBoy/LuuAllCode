package com.yuqiyu.lessonOne.controller;


import com.yuqiyu.chapter12.AppException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @title: luyu
 * @ClassName ThinkingInJava
 * @description: TODO
 * @date 2019/4/28 22:11
 */
@RestController
public class TestController {

    @RequestMapping("/test/one")
    @AppAuthorization
    public void  test(@RequestParam String flag){
        throw new AppException();

    }
}
