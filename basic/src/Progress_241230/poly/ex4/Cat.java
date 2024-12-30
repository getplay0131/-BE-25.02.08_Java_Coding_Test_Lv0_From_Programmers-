package Progress_241230.poly.ex4;

public class Cat extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println(" ------------------ ");
        System.out.println("고양이가 웁니다!");
        System.out.println("냥냥냥아치...");
        System.out.println(" =================== ");
    }

    @Override
    public void move() {
        System.out.println(" ------------------ ");
        System.out.println("고양이가 움직입니다!");
        System.out.println("이동하여... 궁둥이를 들이댑니다!! 궁디 팡팡!!!");
        System.out.println(" =================== ");
    }
}