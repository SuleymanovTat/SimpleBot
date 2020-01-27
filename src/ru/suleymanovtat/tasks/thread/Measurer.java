package ru.suleymanovtat.tasks.thread;


import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Objects;

public class Measurer {

    final int a = 6;

    public static void main(String[] args) {
        C c = new C(1, 2, 3);
        C c1 = new C(1, 2, 3);
        C c2 = new C(1, 1, 3);

        try {
            Field field = C.class.getDeclaredField("c");
            field.setAccessible(true);
            int fieldValue = field.getInt(c);
            System.out.println("Reflection " + fieldValue);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("hash code " + c.hashCode());
        System.out.println("hash code " + c1.hashCode());
        System.out.println("hash code " + c2.hashCode());
        System.out.println("getClass " + c2.getClass());
        c = null;
        c1 = null;
        c2 = null;
        System.gc();
        System.out.println("end ");
    }
}

class C {

    int a;
    int b;
    private int c = 10;

    public C(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C c1 = (C) o;
        return a == c1.a &&
                b == c1.b &&
                c == c1.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize");
    }
}