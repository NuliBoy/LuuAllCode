package com.test.stategy1;

public class Test {
    public static void main(String[] args) {
        RedCharacter red = new RedCharacter(new SlowSpeed(),new FirstFight());
        red.move();
        red.fight();
        red.display();
        red.speed();
    }
}
