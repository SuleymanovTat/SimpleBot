package ru.suleymanovtat.tasks;

public class MyClass {

    private MyClass() { }

    private void method1() {
        new MyClass();
    }

    public void method2() {
        new MyClass();
    }
}