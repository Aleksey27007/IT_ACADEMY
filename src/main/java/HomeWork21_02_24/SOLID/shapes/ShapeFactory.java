package HomeWork21_02_24.SOLID.shapes;

import Lesson18Practice.GeometricShapes.Shape;

public class ShapeFactory {
    public ShapeInterface createShape(ShapeType type, double... params) {
        switch (type) {
            case CIRCLE -> {
                return new Circle(params[0]);
            }
            case SQUARE -> {
                return new Square(params[0]);
            }
            case TRIANGLE -> {
                return new Triangle(params[0], params[1]);
            }
            default -> throw new IllegalArgumentException("Unsupported shape type.");
        }
    }
}
