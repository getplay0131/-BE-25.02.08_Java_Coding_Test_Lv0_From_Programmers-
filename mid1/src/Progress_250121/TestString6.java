package Progress_250121;

public class TestString6 {
    public static void main(String[] args) {
    String str = "start hello java, hello spring, hello jpa";
    String key = "hello";
    int count = 0;
//    String [] strArr = str.split(" ");
//        for (String string : strArr) {
//            if (string.equals(key)){
//                count++;
//            }
//        }
        int startInd = str.indexOf(key);
        while (startInd >= 0){
            startInd = str.indexOf(key, startInd + 1);
            count++;
        }
        System.out.println("count = " + count);
    }
}