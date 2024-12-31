package Progress_241231.poly.car0;

public class Driver {
private K3Car K3Car;
private Model3Car Model3Car;

    public void setK3Car(K3Car k3Car) {
        this.K3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car) {
        Model3Car = model3Car;
    }

    public void drive(){
        System.out.println("운전을 시작합니다.");
        if (K3Car != null) {
        K3Car.driveStart();
        } else if (Model3Car != null) {
            Model3Car.driveStart();
        }
        System.out.println(" ======================= ");
    }
}