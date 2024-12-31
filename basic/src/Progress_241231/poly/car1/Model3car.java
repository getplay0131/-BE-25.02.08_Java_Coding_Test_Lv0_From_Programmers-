package Progress_241231.poly.car1;

public class Model3car implements Car{
    @Override
    public void startEngine() {
        System.out.println("Model3 시동을 킵니다");
    }

    @Override
    public void offEngine() {
        System.out.println("Model3 시동을 끕니다.");
    }

    @Override
    public void pressAcceletor() {
        System.out.println("Model3 차량이 가속합니다. 위이이잉~");
    }

}