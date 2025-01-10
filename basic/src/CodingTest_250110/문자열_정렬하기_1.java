package CodingTest_250110;

import java.lang.reflect.Array;
import java.util.Arrays;

//문자열 정렬하기 - 1
//문자열이 주어질때 해당 문자열안에 숫자가 있다면, 오름차순으로 정렬된 배열을 반환
public class 문자열_정렬하기_1 {
    public int[] solution(String my_string) {

//        첫번째 시도
//        for (int i = 0; i < my_string.length(); i++) {
//            char [] charArrays = my_string.toCharArray();
//            my_string.equals("^[0-9]*$");
//            if (charArrays[i] == "") {
//
//            }
//        }

//        두번째 시도
        char [] charArray = my_string.toCharArray();
        int count = 0;
        for (char c : charArray) {
            if (c >= '0' && c <= '9') {
                count++;
            }
        }

        int[] answer = new int[count];
        int index = 0;
        for (char c : charArray) {
            if (c >= '0' && c <= '9') {
                answer[index++] = c -'0';
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}