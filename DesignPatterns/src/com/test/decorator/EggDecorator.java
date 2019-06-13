package com.test.decorator;

public class EggDecorator extends  AbstractDecorator{
    public EggDecorator(AbatterCake abatterCake) {
        super(abatterCake);
    }

    @Override
    String getDesc() {
        return super.getDesc()+"加鸡蛋";
    }

    @Override
    int cost() {
        return super.cost()+1;
    }
}
