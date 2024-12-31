package Progress_241231.poly.car1;

public class Driver {
    private Car car;

    public void setCars(Car cars) {
        if (cars != null) {
            this.car = cars;
        }
    }

    public void driveStart(Car cars) {
        if (cars != null) {
            System.out.println("차량 운전을 시작합니다. : " + cars);
            cars.startEngine();
            cars.pressAcceletor();
            cars.offEngine();
            System.out.println(" ================ ");
        }
    }
}