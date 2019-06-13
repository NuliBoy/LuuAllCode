package com.test.decorator;

public  class AbstractDecorator extends AbatterCake{
    private AbatterCake abatterCake;


    public AbstractDecorator(AbatterCake abatterCake){
        this.abatterCake = abatterCake;

    }

    @Override
    String getDesc() {
        return this.abatterCake.getDesc();
    }

    @Override
    int cost() {
        return this.abatterCake.cost();
    }
}
