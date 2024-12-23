package Progress_241223.extends1.overriding;

public class ElectricCar extends Car {
    public void charge() {
        System.out.println("전기를 충전합니다.");
    }

    @Override
    public void move() {
        System.out.println("차를 빠르고 조용하게 이동합니다.");
    }
}