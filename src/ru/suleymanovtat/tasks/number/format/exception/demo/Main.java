package ru.suleymanovtat.tasks.number.format.exception.demo;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            // code that may throw an exception
            int a = 4 / 0;
            System.out.println(a);
        } finally {
            // code always be executed
            System.out.println("finally");
        }
        System.out.println("end");
    }
}
