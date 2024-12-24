package Progress_241224.poly.overriding;

import Progress_241224.poly.overriding.Parent;

public class Child extends Parent {
private String value = "child";

    @Override
    public String getValue() {
        return value;
    }

    public void method(){
    System.out.println("Child.method");
}
}