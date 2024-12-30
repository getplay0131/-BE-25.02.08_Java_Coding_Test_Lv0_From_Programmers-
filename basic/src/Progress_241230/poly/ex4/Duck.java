package Progress_241230.poly.ex4;

public class Duck extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println(" ------------------ ");
        System.out.println("오리가 웁니다!");
        System.out.println("꽥꽥꽥꽥꽥꽥꽥꽥꽥꽥");
        System.out.println(" =================== ");
    }

    @Override
    public void move() {
        System.out.println(" ------------------ ");
        System.out.println("오리가 움직입니다!");
        System.out.println("이동하여... 오리로 가나...");
        System.out.println(" =================== ");
    }
}