package ru.suleymanovtat.tasks.npe;

import java.util.*;

class FixingNullPointerException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = "null".equals(string) ? null : string;
        /* Do not change code above */
        System.out.println(string == null ? "NPE!" : string.toLowerCase());
        System.out.println(toPrimitive(new Boolean("true")));
        System.out.println(toPrimitive(new Boolean("false")));
        System.out.println(toPrimitive(null));
    }

    public static boolean toPrimitive(Boolean b) {
        if (b == null) {
            return false;
        } else {
            return b;
        }
    }
}