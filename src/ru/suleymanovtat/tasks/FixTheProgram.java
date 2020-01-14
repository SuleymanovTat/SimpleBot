package ru.suleymanovtat.tasks;

import java.util.Scanner;

public class FixTheProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        number++;
        System.out.println(number);
    }
}