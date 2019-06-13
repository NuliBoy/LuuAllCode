

package com.test.stategy1;

public  abstract class Character

{
    public Speed imSpeed;
    public Fight imFight;

    public Character(Speed imSpeed, Fight imFight) {
        this.imSpeed = imSpeed;
        this.imFight = imFight;
    }

    void move(){
       System.out.println("move.......");
   }

   public void speed(){
        imSpeed.imSpeed();
   }

   public void fight(){

        imFight.imFight();
   }

   abstract void display();
}
