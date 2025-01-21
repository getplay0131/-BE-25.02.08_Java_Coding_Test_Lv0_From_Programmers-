package Progress_250121;

public class TestString10 {
    public static void main(String[] args) {
    String fruits = "apple,banana,mango";

    String [] fruitsArr = fruits.split(",");
        String joinFruits = null;
        for (String string : fruitsArr) {
            System.out.println("과일명 : " + string);
            joinFruits = String.join("=>",fruitsArr);
        }
        System.out.println("joinFruits = " + joinFruits);
    }
}