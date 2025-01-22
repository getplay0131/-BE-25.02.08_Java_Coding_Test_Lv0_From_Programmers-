package Progress_250122;

public class ClassCreatemain {
    public static void main(String[] args) throws Exception {
//    Class helloClass = Hello.class;
    Class helloClass = Class.forName("Progress_250122.Hello");
    Hello hello =(Hello) helloClass.getDeclaredConstructor().newInstance();
    String result = hello.hello();
        System.out.println("result = " + result);
    }
}