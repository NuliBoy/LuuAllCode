package com.example.generaldealresponse.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.generaldealresponse.error.Error;
/**
 * @author luyu
 * @ClassName DemoException
 * @description: TODO
 * @date 2019/6/11 10:14
 * @Version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
public class DemoException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    protected Error error;

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }


}

