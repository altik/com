package com.funky.line.mypatterns.observer;

/**
 * Created by Rudniev Oleksandr on 29.11.2016.
 */
interface IObserver {

    void update();

    void setSubject(ISubject subject);
}
