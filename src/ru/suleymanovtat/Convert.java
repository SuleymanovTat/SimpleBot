package ru.suleymanovtat;

import java.util.Scanner;

public class Convert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = null;
        String message = null;
        StringBuilder text = new StringBuilder(scanner.nextLine().replace(" ", "").trim());
        if (text.substring(0, 1).equals("<")) {
            parserXml(key, message, text);
        } else {
            parserJson(key, message, text);
        }
    }

    private static void parserJson(String key, String message, StringBuilder text) {
        text.deleteCharAt(0);
        text.deleteCharAt(0);
        for (int i = 0; i < text.length(); i++) {
            if (key == null && text.charAt(i) == '"') {
                key = text.substring(0, i);
                text.replace(0, i + 2, "").toString().replace("}", "");
                continue;
            }
            if (text.equals("null")) {
                message = null;
                break;
            }
            if (text.charAt(i) == '"') {
                message = text.toString().replace("\"", "").replace("}", "");
            }
        }
        if (message == null) {
            System.out.println("<" + key + "/>");
        } else {
            System.out.println("<" + key + ">" + message + "</" + key + ">");
        }
    }

    private static void parserXml(String key, String message, StringBuilder text) {
        text.deleteCharAt(0);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '>') {
                key = text.substring(0, i).replace("/", "");
                text.replace(0, i + 1, "");
            }
            if (text.length() > 0 && text.substring(i, text.length()).equals("</" + key + ">")) {
                text.replace(i, text.length(), "");
                message = text.toString();
            }
        }
        if (message == null) {
            System.out.println("{\"" + key + "\":" + message + "}");
        } else {
            System.out.println("{\"" + key + "\":\"" + message + "\"}");
        }
    }
}
