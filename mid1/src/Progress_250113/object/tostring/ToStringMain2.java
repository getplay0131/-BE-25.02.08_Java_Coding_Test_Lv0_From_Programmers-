package Progress_250113.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("ModelY");
        Dog dog1 = new Dog("멍멍이", 2);
        Dog dog2 = new Dog("댕댕이", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. printLn 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        String refValue = Integer.toHexString(System.identityHashCode(car));
        System.out.println("refValue = " + refValue);
        String refValue1 = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue1 = " + refValue1);
        String refValue2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("refValue2 = " + refValue2);
    }
}