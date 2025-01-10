package CodingTest_250110;

public class 피자나눠먹기_3 {
//피자 조각 : 2~10조각
//    피자 조각 수 :slice
//    식사 인원 : n
//    인원 1명당 최소 1조각을 먹어야 함 > 최종 필요한 피자 판 수

    public int solution(int slice, int n) {
        int answer = 0;
        if (n % slice ==  0) {
            return answer = n / slice;
        } else {
            return answer = (n / slice)+1;
        }
    }
//조각 : 4조각, 인원수 12명
//    public int solution(int slice, int n) {
//        (3+5-1)/5 = 7/5 = 1
//         (12+4-1) / 12 = 15 / 4 = 3
//        return (n + slice - 1) / slice;
//    }

}