package Progress_250122;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
    int iterations = 1_000_000_000;
    long startTime, endTime;
    
    long sumPrimtive= 0;
    startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimtive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimtive = " + sumPrimtive);
        System.out.println("기본 자료형 long 실행 시간 : " + (endTime - startTime)+ "ms");
        
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 long 실행 시간 : " + (endTime - startTime)+ "ms");
    }
}