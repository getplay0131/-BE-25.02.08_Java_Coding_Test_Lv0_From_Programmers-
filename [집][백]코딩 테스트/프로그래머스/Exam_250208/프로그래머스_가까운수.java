package Exam_250208;
//정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
//입출력 예 #1
//
//3, 10, 28 중 20과 가장 가까운 수는 28입니다.
//입출력 예 #2
//
//10, 11, 12 중 13과 가장 가까운 수는 12입니다.

import java.util.Arrays;

public class 프로그래머스_가까운수 {
    public int solution(int[] array, int n) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        int answer = 0;
        int[] array = {3,10,28};
        int n = 20;
        int[] ints = new int[array.length + 1];
        System.arraycopy(array,0,ints,0,ints.length);
        ints[ints.length-1] = n;
        //    입력 받는 변수 순서 정렬
        Arrays.sort(ints);
        for (int i = 0; i < ints.length ; i++) {
            if (ints[i] == n && i != ints.length-1 && i != 0) {
                int beforeNum = ints[i-1];
                int afterNum = ints[i+1];
                if ((beforeNum - n) > (afterNum - n)) {
                    answer = afterNum;
                } else {
                    answer = beforeNum;
                }
            } else if (ints[i] == n && i == 0) {
                answer = ints[i+1];
            } else {
                answer = ints[ints.length-2];
            }
        }
        System.out.println("answer = " + answer);
//    정수 n을 배열에 추가
//        정수 배열의 크기 + 1의 크기를 가진 새 배열에 복사해서 비교
//        정수 n 전과 이후 수에 대해 정수 n과의 비교
//        값 차이가 덜 나는 수를 리턴
    }
}