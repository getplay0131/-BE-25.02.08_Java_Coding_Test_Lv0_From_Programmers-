package Progress_241223.extends1.ex2;

import Progress_241223.extends1.ex1.ElectricCar;
import Progress_241223.extends1.ex1.GasCar;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar= new GasCar();
        gasCar.move();
        gasCar.fillUp();

    }
}