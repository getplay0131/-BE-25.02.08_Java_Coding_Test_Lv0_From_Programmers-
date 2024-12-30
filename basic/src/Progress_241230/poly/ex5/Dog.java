package Progress_241230.poly.ex5;

public class Dog implements InterfaceAnimal{
    @Override
    public void move() {
        System.out.println(" -------------- ");
        System.out.println("강아지가 이동합니다!");
        System.out.println(" ================ ");
    }

    @Override
    public void sound() {
        System.out.println(" -------------- ");
        System.out.println("강아지가 짖습니다!");
        System.out.println(" ================ ");
    }
}