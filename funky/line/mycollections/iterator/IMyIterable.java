package com.funky.line.mycollections.iterator;

/**
 * Created by Rudniev Oleksandr on 09.12.2016.
 */
public interface IMyIterable<T> {

    IMyIterator<T> myIterator();
}
