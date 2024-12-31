package Progress_241231.poly.car1;

public class K3car implements Car{
    @Override
    public void startEngine() {
        System.out.println("K3 시동을 겁니다");
    }

    @Override
    public void offEngine() {
        System.out.println("K3 시동을 끕니다.");
    }

    @Override
    public void pressAcceletor() {
        System.out.println("K3 차량이 가속합니다.");
    }

    public void driveStart(){
        startEngine();
        pressAcceletor();
        offEngine();
        System.out.println(" ================ ");
    }
}