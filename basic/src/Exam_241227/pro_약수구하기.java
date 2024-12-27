package Exam_241227;

//정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
public class pro_약수구하기 {
    public int[] solution(int n) {
        int arrayCount = 0;
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                arrayCount++;
            }
        }
        int[] answer = new int[arrayCount];
        int idx = 0;
        for (int i = 1; i <= n ; i++) {
            if ((n % i) == 0) {
            answer[idx] = i;
            idx++;
            }
        }
        return answer;
    }
}