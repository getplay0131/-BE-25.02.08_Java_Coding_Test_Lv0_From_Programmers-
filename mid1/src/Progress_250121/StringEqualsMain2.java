package Progress_250121;

public class StringEqualsMain2 {
    public static void main(String[] args) {
    String str1 = new String("hello");
    String str2 = new String("hello");

        System.out.println("메서드 호출 비교1 " + isSmae(str1,str2));


        String str3 = "hello";
        String str4 = "hello";

        System.out.println("메서드 호출 비교2 " + isSmae(str3,str4));



    }

    public static boolean isSmae(String x, String y){
//        return x == y ;
        return x.equals(y) ;
    }
}