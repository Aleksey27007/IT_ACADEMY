package HomeWork10_01_24CollExceptions.Exceptions;

import java.util.Random;
import java.util.Scanner;

public class GameGuessTheNumber {
    public static void main(String[] args) throws Exception {

        //Реализуйте игру “Угадай число” от 1 до 100 с подсказкой - “искомое число больше/меньше”
        //При неправильном вводе, обработайте ошибку и сообщите пользователю
        int gameStart = getRandomNumber();
        System.out.println(gameStart);
        int myNumber = 0;

        while (myNumber != gameStart) {
            myNumber = getYourNumber(gameStart);
            System.out.println(myNumber);
            if (myNumber == gameStart) {
                System.out.println("Congrations you win.");
            }
        }
    }

    private static int getYourNumber(int botNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int yourNumber = scanner.nextInt();
        try {
            if (yourNumber == 0) {
                throw new NullPointerException("Exception: Your number is null.");
            } else if (yourNumber > botNumber) {
                throw new MyException("Exception: Your number is bigger than it should be.");
            } else if (yourNumber == botNumber) {
                throw new MyException("All good.");
            } else {
                throw new MyException("Exception: Your number is less than it should be.");
            }
        } catch (NullPointerException | MyException e) {
            System.out.println(e.getMessage());
        }
        return yourNumber;
    }

    private static int getRandomNumber() {
        Random random = new Random();
        int maxNumber = 100;

        int randomNumber = random.nextInt(maxNumber + 1);
        System.out.println("Game started!");
        return randomNumber;
    }
}
