package com.yuqiyu.lessonOne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * Created date: 2017-07-22
 *
 * @author mixta@chanjet.com
 */
@Configuration
public class SpringBeanConfigurer implements WebMvcConfigurer {

    @Autowired
    private AuthorizationHandlerInterceptor authorizationHandlerInterceptor;


    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authorizationHandlerInterceptor);
    }

}
