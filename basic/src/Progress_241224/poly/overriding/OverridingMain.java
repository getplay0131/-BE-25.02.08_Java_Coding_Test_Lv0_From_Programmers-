package Progress_241224.poly.overriding;

import Progress_241224.poly.overriding.*;

public class OverridingMain {
    public static void main(String[] args) {
//    자식이 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child > Child");
        System.out.println("value = " + child.getValue());
        child.method();

//        부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent > Parent");
        System.out.println("value = " + parent.getValue());
        parent.method();

//        부모가 자식 인스턴스 참조
        Parent parent1 = new Child();
        System.out.println("Parent > Child");
        System.out.println("value = " + parent1.getValue());
        parent1.method(); //메서드 오버라이딩!

    }
}