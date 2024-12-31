package Progress_241231.poly.car0;

public class Model3Car {
public  void startEngine(){
    System.out.println("Model3Car.startEngine");
}
public void offEngine(){
    System.out.println("Model3Car.offEngine");
}
public void pressAccelerator(){
    System.out.println("Model3Car.pressAccelerator");
}

public void driveStart(){
    startEngine();
    pressAccelerator();
    offEngine();
}
}