package com.test.adapter;

public class Test
{
    public static void main(String[] args) {

        Target target = new AchieveTarget();
        target.request();

        Target adapter = new Adapter();
        adapter.request();

    }
}
