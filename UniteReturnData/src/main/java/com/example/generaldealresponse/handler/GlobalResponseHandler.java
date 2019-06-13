package com.example.generaldealresponse.handler;

import com.example.generaldealresponse.entity.GlobalResponse;
import com.example.generaldealresponse.error.DemoException;
import com.example.generaldealresponse.exception.DemoOneException;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Throwables;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author luyu
 * @ClassName GlobalResponseHandler
 * @description: TODO
 * @date 2019/6/10 21:55
 * @Version 1.0
 */
@Slf4j
@ControllerAdvice(value="com.example.generaldealresponse.controller")
public class GlobalResponseHandler implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
       //默认对返回值进行处理
        return true;

    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                  Class<? extends HttpMessageConverter<?>> selectedConverterType,
                                  ServerHttpRequest request, ServerHttpResponse response) {

        final  String returnTypeName = returnType.getParameterType().getName();
        if ("void".equals(returnTypeName)) {

            return GlobalResponse.success(null);
        }
        if (!selectedContentType.includes(MediaType.APPLICATION_JSON)) {
            return body;
        }
        if ("com.example.generaldealresponse.entity.GlobalResponse".equals(returnTypeName)) {

            return body;
        }

        return GlobalResponse.success(body);
    }

    /**
    *@Description: 拦截基本的异常，在实际项目中
    *@Param: 
    *@return: 
    *@Author: luyu
    *@date: 2019/6/11
    */
    @ResponseBody
    @ResponseStatus
    @ExceptionHandler({DemoException.class})
    public <T> GlobalResponse<T> handlerException(DemoException e){
        log.error(Throwables.getStackTrace(e));
        return GlobalResponse.failure(e.getError().getErrorMsg(),e.getError().getErrorCode());
    }

    @ResponseBody
    @ResponseStatus
    @ExceptionHandler({Throwable.class})
    public <T> GlobalResponse<T> handlerThrowable(Throwable e){
        log.error(Throwables.getStackTrace(e));
        return GlobalResponse.failure(Throwables.getStackTrace(e),null);
    }
}
