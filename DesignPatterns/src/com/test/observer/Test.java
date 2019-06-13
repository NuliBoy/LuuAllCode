package com.test.observer;

/**
 * @author luyu
 * @ClassName Test
 * @description: 测试观察者模式
 * @date 2019/5/20 10:57
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ZhihuAnswer answer = new ZhihuAnswer();
        answer.setDetail("贪婪算法 是设计近似计算的方式之一");

        ZhihuQuestion question = new ZhihuQuestion();
        question.setQuestion("近似问题求解方式");

        ZhihuUser user = new ZhihuUser();
        ZhihuUser1 user1 = new ZhihuUser1();

        question.addObserver(user);
        question.addObserver(user1);

        question.deleteObserver(user);//注销掉其中一个订阅者

        question.produceAnswer(question,answer);

    }
}
