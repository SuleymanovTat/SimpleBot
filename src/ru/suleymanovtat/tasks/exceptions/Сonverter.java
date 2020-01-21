package ru.suleymanovtat.tasks.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Сonverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<String>();
        while (true) {
            String number = scanner.next();
            if ("0".equals(number)) {
                break;
            }
            numbers.add(number);
        }
        converterNumber(numbers);
    }

    private static void converterNumber(List<String> numbers) {
        for (String number : numbers) {
            try {
                System.out.println(Integer.valueOf(number) * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + number);
            }
        }
    }
}
