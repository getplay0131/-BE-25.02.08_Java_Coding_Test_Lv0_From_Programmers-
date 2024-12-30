package Progress_241230.poly.ex4;

public class Cow extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println(" ------------------ ");
        System.out.println("소가 웁니다!");
        System.out.println("음메메메멤");
        System.out.println(" =================== ");
    }

    @Override
    public void move() {
        System.out.println(" ------------------ ");
        System.out.println("소가 움직입니다!");
        System.out.println("이동하여... 다이'소'를 방문하네요!ㅋㅋㅋㅋ");
        System.out.println(" =================== ");
    }
}