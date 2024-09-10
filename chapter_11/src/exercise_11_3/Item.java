package exercise_11_3;

public class Item {
    public String name;
    public double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item: " + name + ", Price: $" + price;
    }
}
