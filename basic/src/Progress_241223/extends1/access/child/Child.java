package Progress_241223.extends1.access.child;

import Progress_241223.extends1.access.parent.Parent;

public class Child extends Parent {
    public  void call(){
        publicValue = 10;
        protectedValue = 10; // 상속 관계 or 같은 패키지
//        defaultValue = 1; // 다른 패키지 접근 불가, 컴파일 오류
//        privateValue = 1; // 접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod();
//        defaultMethod(); // 다른 패키지 접근 불가. 컴파일 오류
//        privateMethod(); // 접근 불가, 컴파일 오류

        printParent();
    }
}