package Progress_250120;

public class RefMain1_1 {
    public static void main(String[] args) {
        Address a = new Address("서울");
//    얕은 복사 = 값을 공유
        Address b = a;
//    깊은 복사 = 값 미공유
        Address c = new Address(a.getValue());
        printValue(a, b, c);

        System.out.println("b 객체의 값 변경 => 평택");
        b.setValue("평택");
//        a에 대해 사이드 이펙트 발생
        printValue(a, b, c);


    }

    public static void printValue(Object a, Object b, Object c) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}