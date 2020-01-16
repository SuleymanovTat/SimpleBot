package ru.suleymanovtat.tasks.number.format.exception.demo;

import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.matches("\\d+")) { // it checks the input line contains only digits
            int number = Integer.parseInt(input);
            System.out.println(number + 1);
        } else {
            System.out.println("Incorrect number: " + input);
        }
    }
}