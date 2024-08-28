package exercise_05_1;

public class ShoppingCart {
    public static void main(String[] args) {
        String customerName = "John Doe";
        String itemDescription = "Laptop";
        String message;
        double price = 10000.00;
        double tax = 1.04;

        int quantity = 6;
        double total;

        message = customerName + " wants to buy a HP " + itemDescription;

        total = (quantity * price) * tax;

        boolean outOfStock = true;

        if (quantity > 1) {
            message = message + "s";
        }

        if (outOfStock) {
            System.out.println("HP" + " is out of stock.");
        } else {
            System.out.println(message);
            System.out.println("Total cost with Tax: R" + total);
        }

    }
}
