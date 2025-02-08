package Exam_250126;
//문제 설명
//1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
public class k의_개수 {
    public int solution(int i, int j, int k) {
//     반복문의 시작 인덱스는 i, 종료 조건은 j로 설정하여 반복문 설정
//        해당 인덱스를 자리수 별로 나누어 k와 비교 > 인덱스를 숫자 배열로 바꾸는게 문제인데..
        int answer = 0;
        for (int l = i; l <= j; l++) {
            char [] charArr = String.valueOf(l).toCharArray();
            for (char c : charArr) {
                if (c -'0' == k) {
                    answer++;
                }
            }

        }

        return answer;
    }
}