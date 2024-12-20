package Exam_241220;

public class Pro_n의배수고르기 {
    public int[] solution(int n, int[] numlist) {
        int arrayLength = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                arrayLength++;
            }
        }

        int[] answer = new int[arrayLength];
        int nCount = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
            answer[nCount] = numlist[i];
           nCount++;
            }
        }
            return answer;
    }
}