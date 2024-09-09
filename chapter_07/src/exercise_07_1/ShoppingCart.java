package exercise_07_1;

public class ShoppingCart {
    public static void main (String[] args){
        String customerName = "John Doe";
        String firstName;
        int spaceIndex;

        // Get the index of the space character (" ") in customerName.
        spaceIndex = customerName.indexOf(" ");

        System.out.println(customerName.indexOf(" "));
        // Use the substring method to parse out the first name and print it.
        firstName = customerName.substring(0, spaceIndex);
        System.out.println(firstName);
    }
}