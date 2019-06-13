package com.test.decorator;

public class BatterCake extends AbatterCake {
    @Override
    String getDesc() {
        return "煎饼";
    }

    @Override
    int cost() {
        return 8;
    }
}
