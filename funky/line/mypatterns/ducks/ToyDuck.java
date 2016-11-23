package com.funky.line.mypatterns.ducks;

import com.funky.line.mypatterns.logic.implement.FlyWithEngine;

/**
 * Created by Rudniev Oleksandr on 23.11.2016.
 */
public class ToyDuck extends ADuck {

    @Override
    public void display() {
        System.out.println("I'm a toy duck!");
    }

    public ToyDuck() {
        setIFly(new FlyWithEngine());
    }
}
