package com.example.factoryDesignPattern;

public class Test {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();

        Shape shape3 = factory.getShape("TRIANGLE");
        shape3.draw();

        Shape shape4 = factory.getShape("SQUARE");
        shape4.draw();
    }
}