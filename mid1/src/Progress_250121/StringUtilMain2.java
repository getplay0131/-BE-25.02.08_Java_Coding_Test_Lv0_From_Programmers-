package Progress_250121;

public class StringUtilMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";
        StringBuilder sb = new StringBuilder();


    String format1 = String.format("num : %d, bool : %b, str : %s", num, bool, str);
        System.out.println(format1);
        String format2 = String.format("숫자 : %.3f", 10.1234);
        System.out.println(format2);

        System.out.printf("숫자 : %.2f\n", 10.1234);

        String regex = "Hello, (Java!|World!)";
        System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));
    }
}