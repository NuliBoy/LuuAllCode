package com.example.generaldealresponse.exception;

import com.example.generaldealresponse.error.DemoException;
import com.example.generaldealresponse.error.Error;
import com.example.generaldealresponse.exceptionEnum.DemoErrorEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author luyu
 * @ClassName DemoException
 * @description: TODO
 * @date 2019/6/11 10:14
 * @Version 1.0
 */
@Data
public class DemoThreeException extends DemoException {

    public  DemoThreeException(){
        init();
    }

    private  void init(){
        this.error = Error.fromErrorEnum(DemoErrorEnum.DEMO_3_ERROR);
    }



}

