package ru.suleymanovtat.tasks.notification;

class Alarm extends Notification {

    public Alarm(String msg) {
        super(msg);
    }

    public void show() {
        System.out.println("ALARM: " + msg);
    }
}