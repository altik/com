package com.funky_line.mypatterns.ducks;

import com.funky_line.mypatterns.logic.implement.FlyWithEngine;

/**
 * Created by Rudniev Oleksandr on 23.11.2016.
 */
public class ToyDuck extends ADuck {

    @Override
    public void display() {
        System.out.println("I'm a toy duck!");

    }

    public ToyDuck() {
        IFlyBehavior = new FlyWithEngine();
    }
}
