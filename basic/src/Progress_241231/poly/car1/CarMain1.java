package Progress_241231.poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Car k3 = new K3car();
        Car model3 = new Model3car();
        Car avante = new Avante();
        Driver driver = new Driver();

        driver.setCars(k3);
        driver.driveStart(k3);

        driver.setCars(model3);
        driver.driveStart(model3);

        driver.setCars(avante);
        driver.driveStart(avante);
    }
}