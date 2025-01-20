package Progress_250120;

public class ImutableMain {
    public static void main(String[] args) {
        ImmutableObj obj = new ImmutableObj(10);
        System.out.println("obj = " + obj.getValue());
        ImmutableObj result = obj.add(20);
        System.out.println("obj = " + result.getValue());


    }
}