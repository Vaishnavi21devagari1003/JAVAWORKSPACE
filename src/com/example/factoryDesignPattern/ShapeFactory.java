package com.example.factoryDesignPattern;

//public class ShapeFactory {
//
//    public static void main(String[] args) {
//
//        ShapeFactory factory = new ShapeFactory();
//
//        Shape shape1 = factory.getShape("CIRCLE");
//        shape1.draw();
//
////        Shape shape2 = factory.getShape("RECTANGLE");
////        shape2.draw();
////    }
//}

public class ShapeFactory {

    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            throw new IllegalArgumentException("Shape type cannot be null");
        }

        switch (shapeType.trim().toUpperCase()) {

            case "CIRCLE":
                return new Circle();


            case "TRIANGLE":
                return new Triangle();

            case "SQUARE":
                return new Square();

            default:
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }
}