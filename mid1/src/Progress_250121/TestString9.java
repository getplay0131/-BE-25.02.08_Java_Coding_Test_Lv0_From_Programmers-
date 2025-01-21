package Progress_250121;

public class TestString9 {
    public static void main(String[] args) {
    String email = "hello@example.com";
    String [] emailArr = email.split("@");
    String id = emailArr[0];
    String domain = emailArr[1];
        System.out.println("ID = " + id);
        System.out.println("Domain = " + domain);
    }
}