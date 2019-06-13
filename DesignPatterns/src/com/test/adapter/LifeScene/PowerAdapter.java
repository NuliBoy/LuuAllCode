package com.test.adapter.LifeScene;

public class PowerAdapter  implements DC5 {
    AC220 ac220 = new AC220();
    @Override
    public int outputDC() {
        int adapterInput = ac220.inputAC();
        int adapterOutput = adapterInput/ 44;
        System.out.println("输入电压AC："+adapterInput+"V"+"  输出电压DC："+adapterOutput+"V");
        return adapterOutput;
    }
}
