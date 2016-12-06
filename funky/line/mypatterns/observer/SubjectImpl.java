package com.funky.line.mypatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rudniev Oleksandr on 05.12.2016.
 */
public class SubjectImpl implements ISubject {

    private List<IObserver> observerList = new ArrayList<>();
    private int state;

    @Override
    public void register(IObserver iObserver) {
        observerList.add(iObserver);
    }

    @Override
    public void unregister(IObserver iObserver) {
        observerList.remove(iObserver);
    }

    @Override
    public int getState() {
        return state;
    }

    @Override
    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (IObserver iObserver : observerList) {
            iObserver.update();
        }

    }

    public String toString() {
        return "SubjectImpl{" +
                "state=" + state +
                '}';
    }
}
