package com.funky_line.mypatterns.ducks;

import com.funky_line.mypatterns.logic.implement.CantIFly;

/**
 * Created by Rudniev Oleksandr on 23.11.2016.
 */
public class WoodDuck extends ADuck {

    @Override
    public void display() {
        System.out.println("I'm a wood duck!");
    }

    public WoodDuck() {
        IFlyBehavior = new CantIFly();
    }
}
