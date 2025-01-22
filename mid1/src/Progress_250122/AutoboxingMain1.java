package Progress_250122;

public class AutoboxingMain1 {
    public static void main(String[] args) {
    int value = 10;
    Integer valueBox = Integer.valueOf(value);

    int unboxedValue = valueBox.intValue();
        System.out.println("valueBox = " + valueBox);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}