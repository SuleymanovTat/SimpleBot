package ru.suleymanovtat.tasks.convert;

import java.util.Scanner;

public class Main {

    /**
     * It returns a double value or 0.0 if an exception occurred
     */
    public static double convertStringToDouble(String s) {
        double d;
        try {
            d = Double.parseDouble(s);
        } catch (Exception e) {
            d = 0.0;
        }
        return d;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = "none".equalsIgnoreCase(line) ? null : line;
        double result = convertStringToDouble(line);
        System.out.println(result);
    }
}