package Progress_250121;

public class TestString2 {
    public static void main(String[] args) {
    String [] arr = {"hello","java","jvm","spring","jpa"};
    int result = 0;
        for (String string : arr) {
            System.out.println(string +" = " +  string.length());
            result += string.length();
        }

        System.out.println("result = " + result + " 글자");
    }
}