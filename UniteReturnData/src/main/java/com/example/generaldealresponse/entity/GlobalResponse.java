package com.example.generaldealresponse.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author luyu
 * @ClassName GlobalResponse
 * @description: TODO
 * @date 2019/6/10 21:44
 * @Version 1.0
 */
@Data
@ToString
@NoArgsConstructor
public class GlobalResponse<T> {

    protected boolean success = false;
    private T data;
    private Integer errorCode;
    private String errorMsg;

    public GlobalResponse(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public  static <T> GlobalResponse<T> success(T data){
        return  new GlobalResponse<>(true,data);
    }

    public  static <T> GlobalResponse<T> failure(String errorMsg, Integer errorCode){
        GlobalResponse<T> resp =   new GlobalResponse<>();
        resp.setErrorCode(errorCode);
        resp.setErrorMsg(errorMsg);
        resp.setSuccess(false);
        return resp;
    }
}
