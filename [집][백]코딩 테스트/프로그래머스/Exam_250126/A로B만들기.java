package Exam_250126;

import java.util.Arrays;

//문제 설명
//문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
public class A로B만들기 {
    public int solution(String before, String after) {
        int answer = 0;
        int count = 0;
        char[] beforeChar = before.toCharArray();
        char[] afterChar = after.toCharArray();
        Arrays.sort(beforeChar);
        Arrays.sort(afterChar);
        for (int i = 0; i < beforeChar.length; i++) {
            if (beforeChar[i] == afterChar[i]) {
                count++;
            }
        }
        if (count == beforeChar.length) {
            answer = 1;
        }
        System.out.println("결과값 : " + answer);
        return answer;
    }

    public static void main(String[] args) {
        int answer = 0;
        int count = 0;
        String before = "allpe";
        String after = "apple";
        char[] beforeChar = before.toCharArray();
        char[] afterChar = after.toCharArray();
        Arrays.sort(beforeChar);
        Arrays.sort(afterChar);
        for (int i = 0; i < beforeChar.length; i++) {
            if (beforeChar[i] == afterChar[i]) {
                count++;
            }
        }
        if (count == beforeChar.length) {
            answer = 1;
        }
        System.out.println("결과값 : " + answer);
    }

}