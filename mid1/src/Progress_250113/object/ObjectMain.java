package Progress_250113.object;

public class ObjectMain {
    public static void main(String[] args) {
    Child child = new Child();
    child.parentMethod();
    child.ChildMethod();

//    toString() : Object 클래스의 메서드
        String str = child.toString();
        System.out.println(str);
    }
}