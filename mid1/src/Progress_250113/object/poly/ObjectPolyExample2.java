package Progress_250113.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object objs = new Object();
        Object[] objects = {dog, car, objs};
        for (Object object : objects) {
            action(object);
        }
        size(objects);
//    action(dog);
//    action(car);

    }

    private static void action(Object obj) {
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

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는 : " + objects.length + "개 입니다.");
    }
}