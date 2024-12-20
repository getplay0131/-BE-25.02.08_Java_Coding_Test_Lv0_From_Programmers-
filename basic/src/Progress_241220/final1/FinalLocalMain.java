package Progress_241220.final1;

public class FinalLocalMain {
    public static void main(String[] args) {
//    지역 변수
        final int data1;
        data1 = 10; //최초 한번만 할당
//        data1 = 20; // 컴파일 오류

        final int data2 = 10;
//        data2 = 20; // 재선언 불가

        method(10);
    }

//    final 매개변수
    static void method(final int parameter){
//        parameter = 20;
        System.out.println("parameter : " + parameter);
    }
}