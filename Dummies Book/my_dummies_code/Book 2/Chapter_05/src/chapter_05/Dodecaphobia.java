package chapter_05;

public class Dodecaphobia {
    public static void main(String[] args) {
        int number = 2;

        while (number <= 20) {
            if (number == 12) {
                break;
            }
            System.out.println(number + " ");
            number += 2;
        }
    }
}
