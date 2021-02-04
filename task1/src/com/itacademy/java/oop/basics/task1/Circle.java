package com.itacademy.java.oop.basics.task1;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side = " + radius +
                ", Area = " + calculateArea() +
                ", Perimeter = "+ calculatePerimeter() +
                '}';
    }
}
