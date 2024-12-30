package Progress_241230.poly.ex4;

public class Dog extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println(" ------------------ ");
        System.out.println("강아지가 짖습니다!");
        System.out.println("으르르를.... 멍멍!!!! ");
        System.out.println(" =================== ");
    }

    @Override
    public void move() {
        System.out.println(" ------------------ ");
        System.out.println("강아지가 움직입니다!");
        System.out.println("이동하여... 쉬를 싸네요.. 영역 표시군요!");
        System.out.println(" =================== ");
    }
}