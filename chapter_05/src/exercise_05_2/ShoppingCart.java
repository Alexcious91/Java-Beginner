package exercise_05_2;

public class ShoppingCart {
    public static void main(String[] args) {
        String customerName = "John Doe";
        String itemDescription = "Shirt";
        String message;

        String[] products = {"iPhone 14", "Cold Drink", "PS5 Console", "Candy"};

        message = customerName + " wants to buy " + products.length + " items.";
        System.out.println(message);

        System.out.println(products[2]);

    }
}
