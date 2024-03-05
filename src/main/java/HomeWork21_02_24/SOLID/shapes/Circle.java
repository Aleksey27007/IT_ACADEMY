package HomeWork21_02_24.SOLID.shapes;

public class Circle implements ShapeInterface {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
