package ru.suleymanovtat.shape;

class Square extends Shape {
    double side;

    // override the method here

    @Override
    public double area() {
        return Math.pow(side, 2);
    }
}