package chapter_02;

public class EnumTest {
    public enum CardSuit { HEARTS, DIAMONDS, CLUBS, SPADES };

    public static void main(String[] args) {
        CardSuit suit = CardSuit.HEARTS;
        System.out.println(suit);
    }
}
