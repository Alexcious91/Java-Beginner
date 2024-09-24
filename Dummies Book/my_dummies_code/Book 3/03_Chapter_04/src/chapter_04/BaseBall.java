package chapter_04;

public class BaseBall extends Ball {
    public BaseBall() {
        setWeight(5.125);
    }

    public void hit() {
        System.out.println("You tore the cover off!");
        super.hit();
    }
}
