package HomeWork21_02_24.SOLID.shapes;

public class Triangle implements ShapeInterface{
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * side * height;
    }
}
