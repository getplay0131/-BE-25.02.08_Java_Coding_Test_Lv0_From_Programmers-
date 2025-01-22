package Progress_250122;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
    int value = 10;
        for (int i = 5; i <= 20; i+=5) {
            System.out.println("결과값 : " + compareTo(value,i));
        }
    }

    public static int compareTo(int value, int input){
        if (value > input) {
            System.out.println("비교 대상인 " + value + "이 더 큽니다.");
            return 1;
        } else if (value < input) {
            System.out.println("비교 대상인 " + value + "이 더 작습니다.");
            return  -1;
        } else {
            System.out.println("비교 대상인 " + value + "과 크기가 같습니다.");
            return 0;
        }
    }
}