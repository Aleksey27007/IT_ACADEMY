package HomeWork18_12_23;

public class Fraction {
    /* Создайте класс с именем fraction, содержащий два поля типа int - числитель и знаменатель
обыкновенной дроби. */
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) { // Конструктор класса должен инициализировать их заданным набором значений
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(){

    }

    public void printFraction() { // Создайте метод класса, который будет выводить дробь в текстовую строку в формате x / y;
        System.out.printf("This is your fraction : %d / %d\n", this.numerator, this.denominator);
    }

    // метод, добавляющий (сложение) к текущей дроби дробь, переданную ему в параметре и возвращающий дробь - результат сложения;
    public void addFractions(Fraction otherFraction) {
        String answerStr = "";
        if (denominator == otherFraction.denominator) {
            System.out.println("Addition with equal denominators...");
            int answerInt = numerator + otherFraction.numerator;
            answerStr = answerInt + " / " + denominator;
            System.out.println(answerStr);

        } else {
            System.out.println("Addition with different denominators...");
            int answerIntNumerator = (numerator * otherFraction.denominator) +
                    (otherFraction.numerator * denominator);
            int answerIntDenominator = denominator * otherFraction.denominator;
            answerStr = answerIntNumerator + " / " + answerIntDenominator;
            System.out.println(answerStr);
        }
    }

//    метод, умножающий (произведение) текущую дробь на число типа double, переданное ему
//    в параметре и возвращающий дробь - результат умножения;

    public void multiplyingFractions(double number) {
        System.out.println("I'm multiplying a fraction by a number...");
        double answer = (int) number * this.numerator;

        System.out.printf("Answer: (%d / %d) * %.2f = %.2f / %d\n", this.numerator, this.denominator,
                number, answer, this.denominator);
    }

    //метод, делящий (деление) текущую дробь на число типа double, переданное ему в
    //параметре и возвращающий дробь - результат деления.

    public void divisionFractions(double number) {
        System.out.println("I'm dividing a fraction by a number...");
        double answer = this.denominator / number;

        System.out.printf("Answer: (%d / %d) / %.2f = %d / %.2f\n", this.numerator, this.denominator,
                number, this.numerator, answer);
    }
}