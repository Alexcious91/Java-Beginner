package exercise_09_2;

import java.sql.SQLOutput;

public class Customer {
    private String name;
    private String ssn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // Encapsulate this class.  Make ssn read only.
    public String getSsn() {
        return ssn;
    }

    public Customer() {
        this.name = "John";
        this.ssn = "12345";
    }

    public Customer(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        Customer newCustomer = new Customer("Alex November", "123456");

        System.out.println(newCustomer.name);
    }
}