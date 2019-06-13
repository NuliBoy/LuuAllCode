package com.test.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author luyu
 * @ClassName ZhihuUser
 * @description: 观察者
 * @date 2019/5/20 9:46
 * @Version 1.0
 */
public class ZhihuUser implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        ZhihuQuestion question = (ZhihuQuestion)o;
        ZhihuAnswer answer = (ZhihuAnswer)arg;
        read(question,answer);
    }
    private void read( ZhihuQuestion question , ZhihuAnswer answer ){

        System.out.println(question.toString());
        System.out.println(answer.toString());
        System.out.println(question.getQuestion()+"的解决方法："+answer.getDetail());
    }
}
