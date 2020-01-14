package ru.suleymanovtat.tasks;

public class Application {

    static String name;

    public static void main(String[] args) {
        name = "SimpleApplication";
        String[] arg = new String[]{"arg1", "arg2", "arg3"};
        run(arg);
    }

    static void run(String[] arg) {
        System.out.println(name);
        for (String text : arg) {
            System.out.println(text);
        }
    }
}
