package com.itacademy.java.oop.basics.task1;

public class ShapeApplication {
    public static void main(String[] args) {

        Square square = new Square(2);

        Circle circle = new Circle(2.5);

        System.out.println(square);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());

        System.out.println(circle);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

    }
}
