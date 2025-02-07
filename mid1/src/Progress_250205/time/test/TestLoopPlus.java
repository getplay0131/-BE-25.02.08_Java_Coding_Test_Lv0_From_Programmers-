package Progress_250205.time.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 01, 01);
        String msg = "날짜";
        for (int i = 0; i < 5; i++) {
            LocalDate plusDays = date.plus(2*i,ChronoUnit.WEEKS);
            System.out.println(msg + " " +  (i+1) +": " + plusDays);
        }

    }
}