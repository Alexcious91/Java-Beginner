package chapter_07;

import java.util.Scanner;

public class GuessingGame_7_2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's play a guessing game.");

        do {
            playAround();
        } while (askForAnotherRound());
    }

    public static void playAround() {
        boolean validInput;
        int number, guess;
        String answer;

        number = getRandomNumber();

        System.out.println("\nI'm thinking of a number between 1 and 10");
        System.out.println("What do you think it is? ");
        guess = getGuess();

        if (guess == number) {
            System.out.println("Congratulations! You got it!");
        } else {
            System.out.println("You're wrong! The number was " + number);
        }
    }

    public static int getRandomNumber() {
        int num = (int) (Math.random() * 10) + 1;
        return num;
    }

    public static int getGuess() {
        while (true) {
            int guess = scanner.nextInt();

            if (guess < 1 || guess > 10) {
                System.out.println("Invalid guess. The number should be between 1 and 10");
            } else {
                return guess;
            }
        }
    }

    public static boolean askForAnotherRound() {
        while (true) {
            String answer;
            System.out.println("Wanna try again? (Y or N)");
            answer = scanner.next();
            if (answer.equalsIgnoreCase("Y")){
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("Thank you for playing!");
                return false;
            }
        }
    }
}
