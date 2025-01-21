package Progress_250121;

public class TestString1 {
    public static void main(String[] args) {
    String url = "https://www.example.com";
        boolean isTest = url.startsWith("https://");

        System.out.println("url = " + url);
        System.out.println("검사 문구 = " + "https://");
        if (isTest) {
            System.out.println("해당 문구로 시작합니다.");
        } else {
            System.out.println("해당 문구로 시작하지 않습니다.");
        }
    }
}