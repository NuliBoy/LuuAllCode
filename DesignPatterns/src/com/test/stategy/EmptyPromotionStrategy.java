package com.test.stategy;

/**
 * @author lubinzhang
 * @version 1.0
 * @className EmptyPromotionStrategy
 * @date 2019/3/12 9:45 PM
 **/
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void activityStrategy() {
        System.out.println("无促销。。。。。");
    }
}
