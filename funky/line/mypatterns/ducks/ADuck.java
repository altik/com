package com.funky.line.mypatterns.ducks;

import com.funky.line.mypatterns.logic.implement.IFlyBehavior;

/**
 * Created by Rudniev Oleksandr on 23.11.2016.
 */
public abstract class ADuck {

    private IFlyBehavior flyBeh;

    ADuck() {
    }

    public abstract void display();

    public void useFlyAbility() {
        flyBeh.fly();
    }

    public void setIFly(IFlyBehavior IFlyBehavior) {
        this.flyBeh = IFlyBehavior;
    }

    public void move() {
        System.out.println("I move like a duck");
    }

    public void swim() {
        System.out.println("I swim like a duck");
    }
}
