package com.funky.line.mypatterns.strategy.implement;

/**
 * Created by Rudniev Oleksandr on 23.11.2016.
 */
public class FlyWithWings implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("I fly because I have wings");
    }
}
