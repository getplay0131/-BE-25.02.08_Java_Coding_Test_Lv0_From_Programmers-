package Progress_250121;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        int matchDot = str.indexOf(".");
        int strEnd = str.length();
        System.out.println("filename = " + str.substring(0, matchDot));

        System.out.println("extName = " + str.substring(matchDot, strEnd));
    }
}