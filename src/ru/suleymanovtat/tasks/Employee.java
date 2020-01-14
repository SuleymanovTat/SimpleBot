package ru.suleymanovtat.tasks;

class Employee {

    String name;
    int salary;
    String address;
    String birthDate;

    public Employee() {
        name = "unknown";
        salary = 0;
        address = "unknown";
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        address = "unknown";
    }

    public Employee(String name, int salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public Employee(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
}