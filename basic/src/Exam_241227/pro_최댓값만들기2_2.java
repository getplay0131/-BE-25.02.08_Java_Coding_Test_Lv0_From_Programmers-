package Exam_241227;

public class pro_최댓값만들기2_2 {
    public int solution(int[] numbers) {
        int answer = -100000000;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length-1; j > i ; j--) {
                int nums = numbers[i] * numbers[j];
                if (answer <= nums) {
                    answer = nums;
                }
            }
        }
        return answer;
    }
}