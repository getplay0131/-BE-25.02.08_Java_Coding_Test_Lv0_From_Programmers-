package Progress_241223.extends1.ex3;

import Progress_241223.extends1.ex3.*;


public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.openDoor();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar= new GasCar();
        gasCar.openDoor();
        gasCar.move();
        gasCar.fillUp();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.openDoor();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
    }
}