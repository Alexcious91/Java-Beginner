package exercise_12_1;

public class Item {
    String name;
    String description;
    double price;

    public Item(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void displayProducts() {
        System.out.println("Name " + name + ", " + "Description: " + description + ", " + price + "\n");
    }
}
