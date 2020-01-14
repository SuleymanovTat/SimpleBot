package ru.suleymanovtat.tasks.shape;

class Rectangle extends Shape {
    double width;
    double height;

    // override the method here

    @Override
    public double area() {
        return width * height;
    }
}
