package com.example.generaldealresponse.exception;

import com.example.generaldealresponse.error.DemoException;
import com.example.generaldealresponse.exceptionEnum.DemoErrorEnum;
import lombok.Data;
import com.example.generaldealresponse.error.Error;

/**
 * @author luyu
 * @ClassName DemoException
 * @description: TODO
 * @date 2019/6/11 10:14
 * @Version 1.0
 */
@Data
public class DemoOneException extends DemoException {

    private static final long serialVersionUID = 1L;

    public  DemoOneException(){
        init();
    }

    private  void init(){
        this.error =Error.fromErrorEnum(DemoErrorEnum.DEMO_1_ERROR);

    }
}

