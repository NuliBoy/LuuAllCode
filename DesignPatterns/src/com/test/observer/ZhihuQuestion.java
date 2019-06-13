package com.test.observer;


import java.util.Observable;

/**
 * @author luyu
 * @ClassName ZhihuQuestion
 * @description: 被观察者
 * @date 2019/5/20 9:30
 * @Version 1.0
 */
public class ZhihuQuestion extends Observable {

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    private String question;


    public void produceAnswer(ZhihuQuestion question,ZhihuAnswer answer){

        setChanged();
        notifyObservers(answer);
    }

    @Override
    public String toString() {
        return "ZhihuQuestion{" +
                "question='" + question + '\'' +
                '}';
    }
}
