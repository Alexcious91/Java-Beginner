package exercise_09_2;

public class Main {
    public static void main(String[] args) {
    Customer newCustomer = new Customer();
    Customer anotherCustomer = new Customer("Alex Doe", "12345");

    System.out.println(newCustomer.getName());
    System.out.println(anotherCustomer.getName());
    }
}
