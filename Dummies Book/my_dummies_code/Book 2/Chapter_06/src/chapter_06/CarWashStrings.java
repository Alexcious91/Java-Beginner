package chapter_06;
// 6.5
import java.util.Scanner;

public class CarWashStrings {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The car wash application!\n\n");
        System.out.print("Enter the package code: ");
        String s = scanner.nextLine();

        String details = "";

        switch (s.toUpperCase()) {
            case "PRESIDENTIAL":
                details += "\tNew Car Scent, plus ... \n";
                break;
            case "ELITE":
                details += "\tTire Treatment, plus ... \n";
            case "DELUXE":
                details += "\tLeather/Vinyl Treatment, plus ... \n";
            case "SUPER":
                details += "\tWax, plus ... \n";
            case "STANDARD":
                details += "\tWash, vacuum, and hand dry.\n";
                break;
            default:
                details = "That's not one of the codes.";
                break;
        }
        System.out.println("\nThat package includes: \n");
        System.out.println(details);
    }
}
