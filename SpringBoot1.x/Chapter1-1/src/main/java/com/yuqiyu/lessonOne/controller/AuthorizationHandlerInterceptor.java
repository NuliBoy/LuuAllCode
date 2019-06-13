package com.yuqiyu.lessonOne.controller;

import com.yuqiyu.chapter12.AppException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * Created date: 2017-07-23
 *
 * @author mixta@chanjet.com
 */
@Component
public class AuthorizationHandlerInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            String appKey = request.getHeader("appKey");
            String appSecret = request.getHeader("appSecret");
            String accessToken = request.getHeader("accessToken");
            if (method.isAnnotationPresent(AppAuthorization.class)) {
                if (StringUtils.isEmpty(appKey) || StringUtils.isEmpty(appSecret)) {
                    throw new AppException();
                }
            }
        }

        return super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        super.postHandle(request, response, handler, modelAndView);
    }

}
