package com.yuqiyu.chapter12;


/**
 * @author Administrator
 * @title: luyu
 * @ClassName ThinkingInJava
 * @description: TODO
 * @date 2019/4/28 22:05
 */
public class AppException extends CodeRuntimeException {

    public AppException() {
        this.error = Error.fromErrorEnum(ErrorEnum.TOKEN_ERROR);
    }

}
