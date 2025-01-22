package Progress_250122;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
    MyInteger integer = new MyInteger(10);

        int [] intArr = {5,10,15,20};
        for (int i : intArr) {
            System.out.println(integer.compareTo(i));
        }
    }
}