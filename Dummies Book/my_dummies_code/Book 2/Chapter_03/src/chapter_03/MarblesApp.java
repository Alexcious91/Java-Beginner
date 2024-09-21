package chapter_03;

import java.util.Scanner;

public class MarblesApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfMarbles;
        int numberOfChildren;
        int marblesPerChild;
        int marblesLeftOver;


        System.out.println("Welcome to the Marbles App!\n");
        System.out.print("Number of Marbles: ");
        numberOfMarbles = sc.nextInt();
        System.out.print("Number of Children: ");
        numberOfChildren = sc.nextInt();

        marblesPerChild = numberOfMarbles / numberOfChildren;
        marblesLeftOver = numberOfMarbles % numberOfChildren;

        System.out.println("Give each child " + marblesPerChild + " marbles per child.");
        System.out.print("You will have " + marblesLeftOver + " marbles left over.");
    }
}
