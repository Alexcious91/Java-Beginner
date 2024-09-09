package exercise;

public class ShoppingCart {
    public static void main(String[] args) {
        System.out.println("Welcome to Shopping!");

        System.out.println(printNums(250));
    }


    public static int printNums(int num){
        if(num == 25){
            return 25;
        }else {
            return printNums(100);

        }
    }
}