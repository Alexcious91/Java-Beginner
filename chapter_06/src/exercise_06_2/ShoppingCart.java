package exercise_06_2;

public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();

        item1.description = "HP Laptop";
        item2.description = "iPhone";
        item1.price = 20.00;

        System.out.println("Item 1 Description: " + item1.description);
        System.out.println("Item 2 Description: " + item2.description);
        item1.getProduct();
    }
}
