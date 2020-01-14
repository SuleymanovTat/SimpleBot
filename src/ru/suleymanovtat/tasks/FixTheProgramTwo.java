package ru.suleymanovtat.tasks;

import java.util.Scanner;

public class FixTheProgramTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = a + b + c;
        System.out.println(sum);

        int c1 = a <= b ? a + b : a - b;
        int c2 = a - b > 0 ? a + b : a - b;
        int c3 = a - b > 0 ? a - b : a + b;
        System.out.println(c1 + " " + c2 + " " + c3);
    }
}