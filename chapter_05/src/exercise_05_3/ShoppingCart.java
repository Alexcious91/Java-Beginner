package exercise_05_3;

public class ShoppingCart {
    public static void main(String[] args) {
        String customerName = "John Doe";
        String message;

        double price = 499.99;
        int quantity = 6;
        double tax = 0.14;

        String[] products = {"iPhone 14", "Cold Drink", "PS5 Console", "Candy"};

        message = customerName + " wants to purchase " + products.length + " items.";
        System.out.println(message);

        System.out.println("\nItems in cart: ");

        for (String product : products) {
            System.out.println(product);
        }
    }
}
