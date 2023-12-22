package HomeWork18_12_23;

public class Main {

    public static void main(String[] args) {
        Fraction frac = new Fraction(4, 7);
        Fraction newFrac = new Fraction(7, 7);

        frac.printFraction();
        newFrac.printFraction();

        frac.addFractions(newFrac); // сложение дробей

        frac.multiplyingFractions(3); // умножение дроби на число типа double

        newFrac.divisionFractions(3); // деление дроби на число типа double
    }
}
