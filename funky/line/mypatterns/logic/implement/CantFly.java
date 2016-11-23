package com.funky.line.mypatterns.logic.implement;

/**
 * Created by Rudniev Oleksandr on 23.11.2016.
 */
public class CantFly implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm believe i can fly... but it's wrong...");
    }
}
