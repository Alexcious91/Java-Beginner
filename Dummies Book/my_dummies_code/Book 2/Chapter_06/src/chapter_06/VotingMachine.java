package chapter_06;

import java.util.Scanner;
// 6.2
public class VotingMachine {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the voting machine error code decoder \n \n" +
                        "If your voting machine generates an error code,\n" +
                        "you can use this program to determine the exact\ncause of the error.");
        System.out.print("Enter the error code: ");
        int errorCode = scanner.nextInt();

        String message;

        switch (errorCode) {
            case 1:
                message = "Voter marked more than one candidate.\nBallot rejected";
                break;
            case 2:
                message = "Box checked and write-in candidate entered.\nBallot rejected";
                break;
            case 3:
                message = "Entire ballot was blank.\nBallot filled in according to "
                    + "secret plan.";
                break;
            case 4:
                message = "Nothing unusual about the ballot.\n"
                        + "Voter randomly selected for tax audit.";
                break;
            case 5:
                message = "Voter filled in every box.\n"
                        + "Ballot counted twice.";
                break;
            case 6:
                message = "Voter drooled in voting machine.\n"
                        + "Beginning spin cycle.";
                break;
            case 7:
                message = "Voter lied to pollster after voting.\n"
                        + "Voter's ballot changed "
                        + "to match polling data.";
                break;
            default:
                message = "Voter filled out ballot correctly.\n"
                        + "Ballot discarded anyway.";
                break;
        }
        System.out.println(message);
    }
}
