package ru.suleymanovtat;

import java.util.Scanner;

public class PreparingFullName {
    public static String prepareFullName(String firstName, String lastName) {
        String first = firstName == null ? "" : firstName + " ";
        String last = lastName == null ? "" : lastName + " ";
        return first + last;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;
        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;
        System.out.println(prepareFullName(firstName, lastName));
    }
}
