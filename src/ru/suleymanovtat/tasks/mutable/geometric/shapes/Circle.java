package ru.suleymanovtat.tasks.mutable.geometric.shapes;

final class Circle implements MutableShape {
    /**
     * Defines the horizontal position of the center of the circle
     */
    private float centerX;

    /**
     * Defines the vertical position of the center of the circle
     */
    private float centerY;

    /**
     * Defines the radius of the circle
     */
    private float radius;

    public Circle(float centerX, float centerY, float radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public float getCenterX() {
        return centerX;
    }

    public float getCenterY() {
        return centerY;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public void move(float dx, float dy) {
        this.centerX = centerX + dx;
        this.centerY = centerY + dy;
    }

    @Override
    public void scale(float factor) {
        this.radius = radius * factor;
    }
}
