package ru.suleymanovtat;

import java.util.Scanner;

public class CyclicallyShiftingElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < len; i++) {
            System.out.print(i == 0 ? array[len - 1] + " " : array[i - 1] + " ");
        }
    }
}
