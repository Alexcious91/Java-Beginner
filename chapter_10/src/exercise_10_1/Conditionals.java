package exercise_10_1;

public class Conditionals {
    public static void main(String[] args) {
        int x = 10, y = 9;

        int result = ((x / y) < 3) ? (x + y) : (x * y);

        System.out.println("Result: " + result);
    }
}
