package Lesson18Practice.GeometricShapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.1);
        System.out.println(circle.calculateSquare());

        Triangle triangle = new Triangle(2,1,3);
        System.out.println(triangle.calculateSquare());
    }
}
