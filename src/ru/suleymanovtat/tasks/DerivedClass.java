package ru.suleymanovtat.tasks;

import ru.suleymanovtat.tasks.base.BaseClass;

public class DerivedClass extends BaseClass {
    private int b;

    public int sum() {
        return a + b;
    }
}
