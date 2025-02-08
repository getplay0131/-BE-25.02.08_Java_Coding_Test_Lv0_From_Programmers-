package Progress_Exam_250207;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);
        
//        1번 방법
        Period between = Period.between(startDate, endDate);
        System.out.println("남은기간 : " + between.getYears() + "년 " + between.getMonths() + "개월 " + between.getDays() + 
                "일");
//        날짜사이의 간격을 일로 구하는것을 헷갈려함
        long betweened = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("디데이 : " + betweened + "일");

    }
}