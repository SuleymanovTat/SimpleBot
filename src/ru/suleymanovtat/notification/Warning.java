package ru.suleymanovtat.notification;

class Warning extends Notification {

    public Warning(String msg) {
        super(msg);
    }

    public String getMsg() {
        return "WARN: " + msg;
    }
}