package ru.suleymanovtat;

public class ConstantsAndUtilities {

    public static final String A_CONSTANT_TTT = "A"; // here is a value

    public static final String B_CONSTANT_QQQ = "B"; // here is another value

    public static String getMagicString() {
        return "getMagicString";// a string
    }

    public static String convertStringToAnotherString(String s) {
        return s;// a string
    }
}

class MainOther {

    public static void main(String[] args) {
        System.out.println(
                ConstantsAndUtilities.A_CONSTANT_TTT + "\n" +
                        ConstantsAndUtilities.B_CONSTANT_QQQ + "\n" +
                        ConstantsAndUtilities.getMagicString() + "\n" +
                        ConstantsAndUtilities.convertStringToAnotherString("aa"));
    }
}