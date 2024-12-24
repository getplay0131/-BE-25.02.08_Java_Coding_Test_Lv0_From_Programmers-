package Progress_241224.poly_basic;

public class CastingMain5 {
    public static void main(String[] args) {
    Parent parent1 = new Parent();
        System.out.println("Parnet1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("Parent2 호출");
        call(parent2);
    }

    public static void call(Parent parent){
        parent.parentMethod();
        if (parent instanceof Child){
            System.out.println("Child 인스턴스 일치");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}