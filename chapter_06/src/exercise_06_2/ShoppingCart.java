package exercise_06_2;

public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();

        item1.description = "HP Laptop";
        item2.description = "iPhone";

        System.out.println("Description: " + item1.description);
    }
}
