package Progress_250122;

public class MyInteger {
  private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public  int compareTo(int input){
        if (value > input) {
            System.out.println("비교 대상인 " + input + "이(가) 더 작습니다.");
            return 1;
        } else if (value < input) {
            System.out.println("비교 대상인 " + input + "이(가) 더 큽니다.");
            return  -1;
        } else {
            System.out.println("비교 대상인 " + input + "과 크기가 같습니다.");
            return 0;
        }
    }
}