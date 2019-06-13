package com.test.stategy;

/**
 * @author lubinzhang
 * @version 1.0
 * @className UseStrategy
 * @date 2019/3/12 9:18 PM
 **/
public class UseStrategy {

    private  PromotionStrategy promotionStrategy;
    public UseStrategy(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }
    public void executePromotionStrategy(){

        promotionStrategy.activityStrategy();
    }

}
