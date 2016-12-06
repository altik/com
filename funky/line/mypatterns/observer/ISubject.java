package com.funky.line.mypatterns.observer;

/**
 * Created by Rudniev Oleksandr on 29.11.2016.
 */
public interface ISubject {

    void register(IObserver iObserver);

    void unregister(IObserver iObserver);

    int getState();

    void setState(int state);

    void notifyObservers();
}
