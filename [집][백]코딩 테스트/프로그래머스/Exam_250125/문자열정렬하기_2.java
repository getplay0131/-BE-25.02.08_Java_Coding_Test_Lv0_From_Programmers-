package Exam_250125;

import java.util.Arrays;

public class 문자열정렬하기_2 {
    public String solution(String my_string) {
        String answer = "";
//        스트링 빌더 선언
        StringBuilder sb = new StringBuilder();
//   입력 문자열 소문자로 변경하여 배열에 담기
        char [] charArr = my_string.toLowerCase().toCharArray();
//배열을 정렬
        Arrays.sort(charArr);
//        결과 문자열에 저장
        for (char c : charArr) {
            sb.append(c);
        }
        answer = sb.toString();
        return answer;
    }

//    public static void main(String[] args) {
//        String my_string = "heLLo";
//
//        String answer = "";
////        스트링 빌더 선언
//        StringBuilder sb = new StringBuilder();
////   입력 문자열 소문자로 변경하여 배열에 담기
//        char [] charArr = my_string.toLowerCase().toCharArray();
////배열을 정렬
//        Arrays.sort(charArr);
////        결과 문자열에 저장
//        answer += charArr.toString();
//        for (char c : charArr) {
//            System.out.println(c);
//        }
//    }
}