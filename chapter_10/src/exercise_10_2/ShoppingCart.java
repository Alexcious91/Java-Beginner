
package exercise_10_2;

public class ShoppingCart {
    public static void main(String[] args) {
        Order order = new Order("Rick Wilson", 100.00, "VA", Order.CORP);

        System.out.println("Discount is: "+ order.getDiscount());
    }
}
