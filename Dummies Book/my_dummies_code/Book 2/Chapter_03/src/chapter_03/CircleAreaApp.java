package chapter_03;

import java.util.Scanner;

public class CircleAreaApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to circle area calculator");
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("The area of the circle is: " + area);
    }
}
