package com.funky.line.mypatterns.strategy.ducks;

import com.funky.line.mypatterns.strategy.implement.CantFly;

/**
 * Created by Rudniev Oleksandr on 23.11.2016.
 */
public class WoodDuck extends ADuck {

    @Override
    public void display() {
        System.out.println("I'm a wood duck!");
    }

    public WoodDuck() {
        setIFly(new CantFly());
    }
}
