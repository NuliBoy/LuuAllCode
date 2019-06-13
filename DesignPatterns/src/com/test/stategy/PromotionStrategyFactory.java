package com.test.stategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lubinzhang
 * @version 1.0
 * @className PromotionStrategyFactory
 * @date 2019/3/12 9:22 PM
 **/
public class PromotionStrategyFactory {

     private PromotionStrategyFactory(){}

     static  Map<String,PromotionStrategy> PROMOATION_STRATEGY_MAP = new HashMap<>();

     static {
        PROMOATION_STRATEGY_MAP.put(ActivityName.FANXIAN.name()
                ,new FanXianPromotionStrategy());
        PROMOATION_STRATEGY_MAP.put(ActivityName.MANJIAN.name()
                ,new ManJianPromotionStrategy());
        PROMOATION_STRATEGY_MAP.put(ActivityName.ZENGPIN.name()
                ,new ZengPinPromotionStrategy());

     }

    public static PromotionStrategy getPromotionStrategy(String activityName){
        System.out.println(PROMOATION_STRATEGY_MAP);
        PromotionStrategy promotionStrategy = PROMOATION_STRATEGY_MAP.get(activityName);

         return promotionStrategy == null?new EmptyPromotionStrategy():promotionStrategy;

    }

    private  enum ActivityName{

        FANXIAN,
        MANJIAN,
        ZENGPIN

    }

}
