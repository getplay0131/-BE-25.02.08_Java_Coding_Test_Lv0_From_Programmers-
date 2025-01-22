package Progress_250122;

public class AutoboxingMain2 {
    public static void main(String[] args) {
    int value = 10;
    Integer valueBox = value;

    int unboxedValue = valueBox;
        System.out.println("valueBox = " + valueBox);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}