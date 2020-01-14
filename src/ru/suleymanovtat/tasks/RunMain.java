package ru.suleymanovtat.tasks;

public class RunMain {
    public static void main(String[] args) {
        User tim = new User();
        tim.setFirstName("Tim");
        tim.setLastName("Towler");
        System.out.println(tim.getFullName()); // Tim Towler

        User katie = new User();
        katie.setFirstName("Katie");
        katie.setLastName(null);
        System.out.println(katie.getFullName());

        User katieNull = new User();
        katieNull.setFirstName(null);
        katieNull.setLastName(null);
        System.out.println(katieNull.getFullName()); // Katie (without additional spaces)
    }
}
