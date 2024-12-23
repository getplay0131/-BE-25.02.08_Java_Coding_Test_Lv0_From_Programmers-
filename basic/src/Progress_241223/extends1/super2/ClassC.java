package Progress_241223.extends1.super2;

public class ClassC extends ClassB{

//    부모의 기본 생성자가 없으므로 super() 사용 불가
    public ClassC(){
        super(10,20);
        System.out.println("ClassC 생성자");
    }
}