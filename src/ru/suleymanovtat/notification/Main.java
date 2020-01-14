package ru.suleymanovtat.notification;

public class Main {
    public static void main(String[] args) {
        Notification notif = new Notification("No problems");
        Notification warn = new Warning("Money ends");
        Notification alarm = new Alarm("The ship drowned");


        System.out.println(alarm.getMsg());
        warn.show();
        notif.show();
        alarm.show();
        System.out.println(warn.getMsg());
    }
}
