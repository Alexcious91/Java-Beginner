package chapter_02;

import java.util.Scanner;

public class ScannerApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();
        System.out.print("You entered: " + x + ".");
    }
}
