package Progress_241231.poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
    Driver driver = new Driver();
    K3Car k3Car = new K3Car();
    driver.setK3Car(k3Car);
    driver.drive();

    Model3Car model3Car = new Model3Car();
    driver.setK3Car(null); // 차량을 한대만 설정가능하기에 k3를 null로 만든다
    driver.setModel3Car(model3Car);
    driver.drive();
    }
}