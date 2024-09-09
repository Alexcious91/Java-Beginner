package exercise_07_2;

public class ShoppingCart {
    public static void main (String[] args){
        String customerName = "John Doe";
        String firstName;
        int spaceIndex;
        StringBuilder sb;

        spaceIndex = customerName.indexOf(" ");
        firstName = customerName.substring(0, spaceIndex);
        System.out.println(firstName);

        //Instantiate and initialize sb to firstName.
        sb = new StringBuilder(firstName);

        sb.append(" Smith");

        System.out.println(sb);
    }
}