package ru.suleymanovtat;

import java.util.Scanner;

public class SumArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int sum = 0;
        for (int number : array) {
            if (n < number) sum += number;
        }
        System.out.println(sum);
    }
}
