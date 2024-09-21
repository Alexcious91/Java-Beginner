package chapter_03;

public class DiceApp {
    public static void main(String[] args) {
        int roll;
        String msg = "Here are 100 random rolls of the dice: ";
        System.out.println(msg);

        for (int i = 0; i < 100; i++) {
            roll = randomInt(1, 6);
            System.out.println(roll + " ");
        }
        System.out.println();
    }

    public static int randomInt(int min, int max) {
        int result = (int) (Math.random() * (max - min + 1) + min);
        return result;
    }
}
