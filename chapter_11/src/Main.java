public class Main {
    public static void main(String[] args) {
        int height = 4, width = 8;

        //  Print rows
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
