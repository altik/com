package com.funky_line.mypatterns.ducks;

import com.funky_line.mypatterns.logic.implement.FlyBehavior;

/**
 * Created by Rudniev Oleksandr on 23.11.2016.
 */
public abstract class ADuck {

    FlyBehavior flyBehavior;

    ADuck() {

    }

    public abstract void display();

    public void useFlyAbility() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void move() {
        System.out.println("I move like a duck");

    }

    public void swim() {
        System.out.println("I swim like a duck");
    }
}
