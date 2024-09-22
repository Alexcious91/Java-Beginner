package chapter_07;

import java.util.Scanner;

public class GuessingGame_7_1 {
    static Scanner scanner = new Scanner(System.in);
    static boolean keepPlaying = true;

    public static void main(String[] args) {
        System.out.println("Let's play a guessing game.");

        while (keepPlaying) {
            playAround();
        }
        System.out.println("Thank you for playing!");
    }

    public static void playAround() {
        boolean validInput;
        int number, guess;
        String answer;

        number = (int) (Math.random() * 10) + 1;
        System.out.println("\nI'm thinking of a number between 1 and 10");
        System.out.print("What do you think it is?...: ");

        do {
            guess = scanner.nextInt();
            validInput = true;
            if (guess < 1 || guess > 10) {
                validInput = false;
                System.out.println("Invalid guess. Number should be between 1 and 10");
            }
        } while (!validInput); // run until correct number is guessed

        if (guess == number) {
            System.out.println("Congratulations, you got it!");
        } else {
            System.out.println("Incorrect! The number was " + number);
            do {
                System.out.println("Wanna try again? (Y or N)");
                answer = scanner.next();
                validInput = true;
                if (answer.equalsIgnoreCase("Y"));
                else if (answer.equalsIgnoreCase("N")) {
                    keepPlaying = false;
                } else {
                    playAround();
                    validInput = false;
                }
            } while (!validInput);
        }
    }
}
