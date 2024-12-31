package Progress_241231.poly.car1;

public class Avante implements Car{
    @Override
    public void startEngine() {
        System.out.println("Avante 시동을 겁니다");
    }

    @Override
    public void offEngine() {
        System.out.println("Avante 시동을 끕니다.");
    }

    @Override
    public void pressAcceletor() {
        System.out.println("Avante 차량이 가속합니다.");
    }

    public void driveStart(){
        startEngine();
        pressAcceletor();
        offEngine();
        System.out.println(" ================ ");
    }
}