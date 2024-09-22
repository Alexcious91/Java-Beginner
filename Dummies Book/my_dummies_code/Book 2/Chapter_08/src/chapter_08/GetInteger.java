package chapter_08;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GetInteger {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int number = getAnInteger();
        System.out.println("You entered: " + number);
    }

    public static int getAnInteger() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException error) {
                scanner.next();
                System.out.println("Your input is not a number: ");
            }
        }
    }
}
