package Progress_250120;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        System.out.println("obj = " + obj.getValue());
        obj.add(20);
        System.out.println("obj = " + obj.getValue());


    }
}