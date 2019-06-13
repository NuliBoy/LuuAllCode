package com.example.generaldealresponse.error;

import com.example.generaldealresponse.exceptionEnum.DemoErrorEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author luyu
 * @ClassName Error
 * @description: TODO
 * @date 2019/6/11 13:47
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Error implements Serializable {

    private static final long serialVersionUID = 1L;

    private String errorMsg;
    private Integer errorCode;

    public static Error fromErrorEnum(DemoErrorEnum errorEnum) {
        return new Error(errorEnum.getErrorMsg(), errorEnum.getErrorCode());
    }

}
