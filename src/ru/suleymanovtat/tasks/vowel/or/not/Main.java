package ru.suleymanovtat.tasks.vowel.or.not;

import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        if (Character.toLowerCase(ch) == 'a' ||
                Character.toLowerCase(ch) == 'e' ||
                Character.toLowerCase(ch) == 'i' ||
                Character.toLowerCase(ch) == 'o' ||
                Character.toLowerCase(ch) == 'u') {
            return true;
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "true" : "false");
    }
}