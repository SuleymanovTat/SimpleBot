package ru.suleymanovtat;

import java.util.Scanner;

public class TheLongestAscendingSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        int result = 1;
        int mainResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                if (mainResult < result) {
                    mainResult = result;
                }
                break;
            }
            if (array[i] < array[i + 1]) {
                result++;
            } else {
                if (mainResult < result) {
                    mainResult = result;
                }
                result = 1;
            }
        }
        System.out.println(mainResult);
    }
}
