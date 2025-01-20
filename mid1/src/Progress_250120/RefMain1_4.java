package Progress_250120;

public class RefMain1_4 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
//    얕은 복사 = 값을 공유
        ImmutableAddress b = a;

        printValue(a,b);
        b = change(b, "수원");
//        a = (ImmutableAddress) changeValue(a,"광겨");
        printValue(a,b);

    }
    public static void printValue(Object a, Object b) {
        System.out.println("a = " + a + "address = " + System.identityHashCode(a));
        System.out.println("b = " + b + "address = " + System.identityHashCode(b));
        System.out.println(a == b); // 참조 비교
        System.out.println(a.equals(b)); // 값 비교
    }

    public static void printValue(Object a, Object b, Object c) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    public static ImmutableAddress change(Object a, String city) {
        return new ImmutableAddress(city);
    }

    public static Object changeValue(Object a, String city) {
        ImmutableAddress temp = new ImmutableAddress(null);
        if (a instanceof ImmutableAddress) {
            temp = new ImmutableAddress(city);
        }
        if (temp == null) {
            System.out.println("오류 발생!");
        }
        return temp;
    }
    }
    