package com.test.decorator;

public class Test {
    public static void main(String[] args) {
        AbatterCake abatterCake;
        abatterCake = new BatterCake();
        abatterCake = new EggDecorator(abatterCake);
        abatterCake = new EggDecorator(abatterCake);
        abatterCake = new SasungDecorator(abatterCake);
        System.out.println(abatterCake.getDesc() + "售价：" + abatterCake.cost());


    }
}
