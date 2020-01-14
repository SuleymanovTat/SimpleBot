package ru.suleymanovtat.tasks.shape;

class Circle extends Shape {
    double radius;

    // override the method here

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}