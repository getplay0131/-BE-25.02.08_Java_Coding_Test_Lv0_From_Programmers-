package Progress_241230.poly.ex6;

public class Bird  extends AbstractAnimal implements Fly{
    @Override
    public void fly() {
        System.out.println("새가 저 멀리 날아갑니다. 푸드덕 거리며..");
    }

    @Override
    public void sound() {
        System.out.println("새가 짹짹 거립니다.");
    }
}