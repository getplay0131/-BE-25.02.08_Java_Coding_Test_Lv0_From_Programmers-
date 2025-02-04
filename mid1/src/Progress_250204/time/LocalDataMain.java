package Progress_250204.time;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDataMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013,11,21);
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);
        
//        계산 (불변)
        LocalDate plusDays = ofDate.plusDays(10);
        System.out.println("지정 날짜 +10 일  = " + plusDays);
//        System.out.println(Integer.parseInt(String.valueOf(System.identityHashCode(plusDays))));
    }
}