package exercise_11_3;

public class ShoppingCart {
    double total;
    Item[] items = {
            new Item("HP Laptop", 18000.00),
            new Item("Pants", 500.00),
            new Item("Samsung Galaxy S7", 2200.00)
    };

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.displayTotal();
    }

    public void displayTotal() {
        for (Item item : items) {
            total += item.price;
        }
        System.out.println("R " + total);
    }
}
