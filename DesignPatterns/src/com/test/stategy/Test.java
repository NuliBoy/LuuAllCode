package com.test.stategy;

/**
 * @author lubinzhang
 * @version 1.0
 * @className Test
 * @date 2019/3/12 9:17 PM
 **/
public class Test {

    public static void main(String[] args) {
        PromotionStrategy promotionStrategy =
                PromotionStrategyFactory.getPromotionStrategy("FANXIAN");
        promotionStrategy.activityStrategy();
    }

}
