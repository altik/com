package com.funky.line.mycollections.iterator;

/**
 * Created by Rudniev Oleksandr on 09.12.2016.
 */
public interface IMyIterator<T> {

    boolean hasNext();

    T next();

    void remove();
}
