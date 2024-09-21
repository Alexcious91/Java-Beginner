package chapter_05;

import java.util.Scanner;

public class NumberPhobia {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = 2;
        String userInput;

        while (number <= 20) {
            System.out.println(number + " ");
            System.out.print("Do you want to keep counting? (Y or N): ");
            userInput = scanner.next();
            if (userInput.equalsIgnoreCase("N")) {
                System.out.println("Program stopped");
                break;
            }
            number += 2;
        }
    }
}
