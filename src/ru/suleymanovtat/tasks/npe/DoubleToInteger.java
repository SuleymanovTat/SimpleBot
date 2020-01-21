package ru.suleymanovtat.tasks.npe;

import java.util.*;

public class DoubleToInteger {

    public static int convert(Double val) {
//         write your code here
        if (Double.isNaN(val)) {
            return 0;
        } else if (Double.POSITIVE_INFINITY == val) {
            return Integer.MAX_VALUE;
        } else if (Double.NEGATIVE_INFINITY == val) {
            return Integer.MIN_VALUE;
        }
        return (int) val.doubleValue();
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = new Double(scanner.next());
        double b = new Double(scanner.next());
        Double doubleVal = new Double(a / b);
        System.out.println(convert(doubleVal));
    }
}