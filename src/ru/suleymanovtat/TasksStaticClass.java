package ru.suleymanovtat;

public class TasksStaticClass {

    static final String TEXT = "Hello";

    int magic = 10;

    static void doSomething() {
        System.out.println(TEXT);
    }

    void doDo() {
        System.out.println(TEXT);
        doSomething();
    }
}
