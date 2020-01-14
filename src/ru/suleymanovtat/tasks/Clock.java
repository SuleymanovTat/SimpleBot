package ru.suleymanovtat.tasks;

public class Clock {

    static int hours = 12;
    static int minutes = 0;

    public static void main(String[] args) {
        next();
    }

    public static void next() {
        minutes++;
        if (minutes == 60) {
            minutes = 0;
            hours++;
            if (hours == 13) {
                hours = 1;
            }
        }
    }
}
