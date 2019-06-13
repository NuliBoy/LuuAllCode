package com.example.generaldealresponse.exceptionEnum;

public enum DemoErrorEnum implements CEnum{

    DEMO_1_ERROR(1001, "错误1"),

    DEMO_2_ERROR(1002, "错误2"),

    DEMO_3_ERROR(1003, "错误3");


    private String errorMsg;
    private Integer errorCode;

    DemoErrorEnum( Integer errorCode,String errorMsg) {
        this.errorMsg = errorMsg;
        this.errorCode = errorCode;
    }

    @Override
    public Integer getErrorCode() {
        return errorCode;
    }

    @Override
    public String getErrorMsg() {
        return errorMsg;
    }
}


