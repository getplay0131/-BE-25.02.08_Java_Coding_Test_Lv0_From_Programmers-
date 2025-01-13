package Progress_250113.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
    Dog dog = new Dog();
    Car car = new Car();
    action(dog);
    action(car);

    }

    private static void action(Object obj)
    {
//        if (obj instanceof Dog) {
//            ((Dog) obj).sound();
//        } else if (obj instanceof Car) {
//            ((Car) obj).move();
//        }

        if (obj instanceof Dog dogs) {
            dogs.sound();
        } else if (obj instanceof Car cars) {
            cars.move();
        }
    }
}