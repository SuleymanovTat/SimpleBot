package ru.suleymanovtat.tasks;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.next());
        for (int i = 0; i < text.length(); i++) {
            text.setCharAt(i, iSVowel(text.charAt(i)));
        }
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (i > 1) {
                if (text.charAt(i - 2) == text.charAt(i - 1) && text.charAt(i - 1) == text.charAt(i)) {
                    text.setCharAt(i - 1, 'T');
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static char iSVowel(char ch) {
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U' || ch == 'y' || ch == 'Y') {
            return '1';
        } else {
            return '0';
        }
    }
}
