package Progress_250122;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
    MyInteger [] intArr = {new MyInteger(-1),new MyInteger(1),new MyInteger(0),new MyInteger(100)};
    int [] intArr2 = {-1,1,0,200};
            for (int i : intArr2) {
                System.out.println(findValue(intArr,i));
            }
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger integer : intArr) {
            if (integer.getValue() == target){
                return integer;
            }
        }
        return null;
    }
}