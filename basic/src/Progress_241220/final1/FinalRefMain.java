package Progress_241220.final1;

public class FinalRefMain {
    public static void main(String[] args) {
final Data data = new Data();
        System.out.println(data);
Data data1 = new Data();
        System.out.println(data1);
//data = data1 // final이기에 변경 불가
data1 = data;
        System.out.println(data1);
//    참조 대상 값 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }


}