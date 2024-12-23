package Progress_241223.extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a){
//        super();
        this(100,0);
        System.out.println("Class B 생성자 a = " + a);
    }

    public ClassB(int a, int b){
        super();
        System.out.println("ClassB 생성자 a = " + a + ", b = " + b);
    }
}