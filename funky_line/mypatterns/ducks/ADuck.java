package com.funky_line.mypatterns.ducks;

import com.funky_line.mypatterns.logic.implement.IFlyBehavior;

/**
 * Created by Rudniev Oleksandr on 23.11.2016.
 */
public abstract class ADuck {

    IFlyBehavior IFlyBehavior;

    ADuck() {

    }

    public abstract void display();

    public void useFlyAbility() {
        IFlyBehavior.fly();
    }

    public void setIFlyBehavior(IFlyBehavior IFlyBehavior) {
        this.IFlyBehavior = IFlyBehavior;
    }

    public void move() {
        System.out.println("I move like a duck");

    }

    public void swim() {
        System.out.println("I swim like a duck");
    }
}
