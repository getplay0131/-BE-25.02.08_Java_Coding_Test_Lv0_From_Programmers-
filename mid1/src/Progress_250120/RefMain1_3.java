package Progress_250120;

public class RefMain1_3 {
    public static void main(String[] args) {
        Address a = new Address("서울");
//    얕은 복사 = 값을 공유
        Address b = a;

        printValue(a,b);

        change(b,"평택");
        printValue(a,b);

    }
    public static void printValue(Object a, Object b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void printValue(Object a, Object b, Object c) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    public static void change(Object a, String city){
        System.out.println("주소 값을 변경합니다. => " + city);
        if (a instanceof Address address) {
            address.setValue(city);
        }
    }
}