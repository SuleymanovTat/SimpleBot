package ru.suleymanovtat.tasks;

import java.util.Scanner;

public class OverloadingPrint {

    public static void print(String strArg) {
        System.out.println(String.format("print(\"%s\")", strArg));
    }

    public static void print(String strArg, int number) {
        System.out.println(String.format("print(\"%s\", %s)", strArg, number));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int val = scanner.nextInt();
        print(str);
        print(str, val);
    }
}
