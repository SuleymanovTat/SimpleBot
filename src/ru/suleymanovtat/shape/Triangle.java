package ru.suleymanovtat.shape;

class Triangle extends Shape {
    double height;
    double base;

    // override the method here
    @Override
    public double area() {
        return base * height / 2d;
    }
}
