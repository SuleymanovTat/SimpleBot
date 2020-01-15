package ru.suleymanovtat.tasks;


import java.util.Arrays;
import java.util.Scanner;

public class MinValueArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println(min);
    }
}
