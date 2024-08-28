package exercise_04_2;

public class ShoppingCart {
    public static void main(String[] args) {
        String customerName = "John Doe";
        String itemDescription = "Shirt";
        String message;
        double price = 300.00;
        double tax = 1.04;

        int quantity = 6;
        double total;

        message = customerName + " wants to buy a HP " + itemDescription;
        System.out.println(message);

        total = (quantity * price) * tax;
        System.out.println("Total cost with Tax: R" + total);
    }
}
