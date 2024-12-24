package Progress_241224.poly_basic;

public class CastingMain2 {
    public static void main(String[] args) {
//    부모가 자식 참조(다형성 참조)
        Parent poly = new Child();
//        자식의 기능 호출 불가.
//        poly.childMethod();

        //    다운캐스팅(부모 => 자식)
//        Child child = (Child) poly;
//        child.childMethod();

//    일시적 다운캐스팅(부모 => 자식) : 해당 메서드 호출 순간만 다운 캐스팅
        ((Child)poly).childMethod();
    }

    }
