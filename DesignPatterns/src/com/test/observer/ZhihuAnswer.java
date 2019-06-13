package com.test.observer;

/**
 * @author luyu
 * @ClassName ZhihuAnswer
 * @description: 观察者模式中的信息介质
 * @date 2019/5/20 10:38
 * @Version 1.0
 */
public class ZhihuAnswer {
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    private  String detail;

    @Override
    public String toString() {
        return "ZhihuAnswer{" +
                "detail='" + detail + '\'' +
                '}';
    }
}
