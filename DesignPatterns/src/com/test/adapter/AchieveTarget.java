package com.test.adapter;

public class AchieveTarget  implements Target{
    @Override
    public void request() {
        System.out.println("实现了目标~~~");
    }
}
