package Progress_250121;

public class StringInfoMain {
    public static void main(String[] args) {
    String str = "Hello, Java";
        System.out.println("문자열의 길이 : " + str.length());
        System.out.println("문자열이 비어 있나? : " + str.isEmpty());
        System.out.println("문자열이 비어 있거나 공백인가? : " + str.isBlank());
        System.out.println("문자열이 비어 있거나 공백인가? : "+ "   ".isBlank());

        int num = 7;
        char c = str.charAt(num);
        System.out.println(num + "번 인덱스의 문자 : " + c);
    }
}