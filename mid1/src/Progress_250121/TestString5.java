package Progress_250121;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        int matchDot = str.indexOf(".");
        int strEnd = str.length();
        System.out.println("filename = " + str.substring(0, matchDot));

        System.out.println("extName = " + str.substring(matchDot, strEnd));
    }
}