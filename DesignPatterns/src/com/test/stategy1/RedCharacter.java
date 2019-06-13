package com.test.stategy1;

public class RedCharacter extends Character {

    public RedCharacter(Speed imSpeed, Fight imFight) {
        super(imSpeed, imFight);
    }

    @Override
    void display() {
        System.out.println("I  am a red robot");
    }
}
