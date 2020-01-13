package ru.suleymanovtat.modifier;

class Counter {

    protected int i = 1221;

    void printCount(){
        System.out.println(i);
    }

    void incCount(){
        i = i + 1;
    }

}