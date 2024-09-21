package chapter_03;

import java.text.NumberFormat;

public class NumberFormatApp {
    static NumberFormat cf = NumberFormat.getInstance();

    public static void main(String[] args) {
        printAllowance();
        printCostOfPaintball();
    }

    public static void printAllowance() {
        double myAllowance = 5.00;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("My Allowance: " + cf.format(myAllowance));
    }

    public static void printCostOfPaintball() {
        double costOfPaintball = 69.50;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("My Cost of Paintball: " + cf.format(costOfPaintball));
    }
}
