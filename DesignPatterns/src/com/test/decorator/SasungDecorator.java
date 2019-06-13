package com.test.decorator;

public class SasungDecorator extends AbstractDecorator{

    public SasungDecorator(AbatterCake abatterCake) {
        super(abatterCake);
    }

    @Override
    String getDesc() {
        return super.getDesc()+"加香肠";
    }

    @Override
    int cost() {
        return super.cost()+2;
    }
}
