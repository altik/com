package com.funky.line.mypatterns.ducks;

import com.funky.line.mypatterns.logic.implement.FlyWithWings;

/**
 * Created by Rudniev Oleksandr on 23.11.2016.
 */
public class RedHeadDuck extends ADuck {

    @Override
    public void display() {
        System.out.println("I'm a Redhead duck!");
    }

    public RedHeadDuck() {
        setIFly(new FlyWithWings());
    }
}
