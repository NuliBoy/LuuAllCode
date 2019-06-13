package com.yuqiyu.chapter8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author luyu
 * @ClassName MyControllerAdvice
 * @description: TODO
 * @date 2019/5/31 23:26
 * @Version 1.0
 */
@ControllerAdvice
public class MyControllerAdvice {


    @Autowired
    HttpServletRequest request;
    @InitBinder
    public  void initBinder(){}


    @ModelAttribute
    public  void addGabolAttribute(Model model){
        model.addAttribute("requestUrl",request.getRequestURL());

    }

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Map<String, Object> myExceptionInfo(Exception ex){
        Map<String,Object> map = new HashMap<>();
        map.put("error",ex.getLocalizedMessage());
        map.put("url",request.getRequestURL());
        return map;
    }
}
