package HomeWork21_02_24.SOLID.shapes;

import Lesson18Practice.GeometricShapes.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        ShapeInterface circle = shapeFactory.createShape(ShapeType.CIRCLE, 4);
        System.out.printf("Circle area: %.2f\n", circle.calculateArea());

        ShapeInterface square = shapeFactory.createShape(ShapeType.SQUARE, 6);
        System.out.printf("Square area: %.2f\n", square.calculateArea());

        ShapeInterface triangle = shapeFactory.createShape(ShapeType.TRIANGLE, 9, 13);
        System.out.printf("Triangle area: %.2f\n", triangle.calculateArea());
    }
}
