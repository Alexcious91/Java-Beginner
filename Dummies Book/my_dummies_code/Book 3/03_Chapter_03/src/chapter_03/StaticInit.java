package chapter_03;

public class StaticInit {
    public static int x;

    static {
        x = 32;
        System.out.println("X value from static block: " + x);
    }

    public StaticInit() {
        System.out.println("Inside constructor");
        x = 64;
    }

    public static void main(String[] args) {
        System.out.println("X value from main before init: " + StaticInit.x);
        StaticInit si = new StaticInit();
        System.out.println("X value from static block: " + si.x);
    }
}
