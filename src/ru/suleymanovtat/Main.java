package ru.suleymanovtat;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.next();
        String line2 = scanner.next();

        System.out.println(line2);
        System.out.println(line1);
        Complex q = new Complex();
        q.image = 5.4;
        q.real = 5.4;
    }
}