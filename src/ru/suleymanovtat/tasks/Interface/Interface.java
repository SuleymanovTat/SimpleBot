package ru.suleymanovtat.tasks.Interface;

interface Interface extends BaseInterface {

    int INT_CONSTANT = 0; // it's a constant, the same as public static final INT_FIELD = 0

    void instanceMethod1();

    void instanceMethod2();

    static void staticMethod() {
        System.out.println("Interface: static method");
    }

    default void defaultMethod() {
        System.out.println("Interface: default method. It can be overridden");
    }
}