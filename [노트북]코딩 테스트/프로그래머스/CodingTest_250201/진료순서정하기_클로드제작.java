package CodingTest_250201;

//문제 설명:
//소아과 병원에서 환자들의 체온을 기준으로 진료 순서를 정하려고 합니다.
//체온이 높은 순서대로 우선적으로 진료를 보며, 입력된 순서대로 환자 번호가 매겨져 있습니다.
//각 환자의 체온이 담긴 배열이 주어질 때, 각 환자의 진료 순서를 배열로 return하도록
//solution 메서드를 완성해주세요.
public class 진료순서정하기_클로드제작 {
    public int[] solution(double[] temperatures) {
        int[] answer = new int[temperatures.length];
        final int LENGTH = temperatures.length;
        for (int i = 0; i < LENGTH; i++) {
            int count = 1;
            for (int j = 0; j < LENGTH; j++) {
                if (temperatures[i] < temperatures[j]) {
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }

    public static void main(String[] args) {
        double[] temperatures = {37.2, 38.4, 37.1, 39.2, 38.0};
        int[] answer = new int[temperatures.length];
        final int LENGTH = temperatures.length;
        for (int i = 0; i < LENGTH; i++) {
            int count = 1;
            for (int j = 0; j < LENGTH; j++) {
                if (temperatures[i] < temperatures[j]) {
                    count++;
                }
            }
            answer[i] = count;
        }
        for (int i : answer) {
            System.out.println(i);
        }
    }
}