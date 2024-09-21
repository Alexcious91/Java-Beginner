package chapter_05;

import java.util.Scanner;

public class GuessingGame {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean keepPlaying = true;
        System.out.println("Welcome To Guessing Game");

        while (keepPlaying) {
            boolean validInput;
            int number, guess;
            String answer;

            number = (int) (Math.random() * 10) + 1;

            System.out.println("I'm thinking of a number between 1 and 10");
            System.out.print("What do you think it is?...: ");
            do {
                guess = scanner.nextInt();
                validInput = true;

                if (guess < 1 || guess > 10) {
                    System.out.println("Invalid number. The range is between 1 and 10");
                    validInput = false;
                }
            } while (!validInput);

            if (guess == number) {
                System.out.println("Congratulations! You have won!");
            } else {
                System.out.println("Sorry wrong number, Correct number was: " + number);
            }

            do {
                System.out.println("Wanna try again? (Y or N)");
                answer = scanner.next();
                validInput = true;
                if (answer.equalsIgnoreCase("Y"));
                else if (answer.equalsIgnoreCase("N")) {
                    keepPlaying = false;
                } else {
                    validInput = false;
                }
            } while (!validInput);
        }
        System.out.println("Thank you for playing!");
    }
}
