package HomeWork21_02_24.SOLID.shapes;

public class Square implements ShapeInterface{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
