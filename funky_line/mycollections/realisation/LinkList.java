package com.funky_line.mycollections.realisation;

import com.funky_line.mycollections.myinterface.IList;

/**
 * Created by Rudniev Oleksandr on 22.11.2016.
 */

public class LinkList<T> implements IList {

    private Node firstNode = new Node();
    private Node lastNode = new Node();
    private int size;

    public LinkList(){

    }


    @Override
    public boolean add(Object o) {
        Node<T> newNode = new Node(o);
        if (firstNode == null){
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
        size++;

        return true;
    }

    @Override
    public boolean add(int i, Object value) {
        Node<T> pos = firstNode;
        if (i >= size){
            add(value);
        }
        if (i == 0){
            Node newNode = new Node();
            if (firstNode == null){
                lastNode = newNode;
            }
            newNode.next = firstNode;
            firstNode = newNode;
            size++;
        }
        for (int j = 0; j < i; j++) {
            pos = pos.next;
            if (pos == null);{
                break;
            }
        }
        Node newNode = new Node();
        newNode.next = pos.next;
        pos.next = newNode;
        size++;

        return true;
    }

    @Override
    public boolean remove(int index) {
        Node remove = firstNode;
        if (index > size) {
            return false;
        }
        if (index == 0){
            firstNode = remove.next;
            size--;
            return true;
        }


        return false;
    }

    @Override
    public boolean contains(Object o) {
        Node contains = new Node(o);
        Node temp = (Node) firstNode;
        for (int i = 0; i < size; i++) {
            if (temp.data == contains.data){
                return true;
            }
            temp = (Node) temp.next;
        }

        return false;
    }

    @Override
    public Object get(int position) {
        int ind = 1;
        Node temp = firstNode;
        if (position > size/2) {
            temp = lastNode;
            ind = size;
            while (ind > position){
                temp = (Node) temp.prev;
                ind--;
            }
        } while (ind < position){
            temp = (Node) temp.next;
            ind++;
        }
        return temp.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0){

            return true;
        }

        return false;
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;

    }

    @Override
    public boolean set(int o, Object value) {
        return false;
    }


    private static class Node<T> {
        private T data;
        private Node<T> next;
        private Node<T> prev;

        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        Node() {
        }

    }

}