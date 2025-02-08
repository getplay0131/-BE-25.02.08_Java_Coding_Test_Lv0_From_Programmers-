package CodingTest_250201;

//외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요
public class 진료순서정하기_프로그래머스 {
    public int[] solution(int[] emergency) {
//        해당 값들을 비교해야한다. 정렬 메서드를 사용하면, 순서가 바뀌기에, 연산자를 활용하여 순위를 비교한다.
//        첫번째 인덱스의 값과 그 이후 값들을 비교하여 제일 크면 1을, 작으면 해당 순위에 1을 더한 값을 저장한다.
//        그리고 해당 값을 결과 배열에 저장한다.
        final int ARRLENGTH = emergency.length;
        int[] answer = new int[ARRLENGTH];
        for (int i = 0; i < ARRLENGTH; i++) {
            int count = 1;
            for (int j = 0; j < ARRLENGTH; j++) {
                if (emergency[i] < emergency[j]) {
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};
        final int ARRLENGTH = emergency.length;
        int[] answer = new int[ARRLENGTH];
        for (int i = 0; i < ARRLENGTH; i++) {
            int count = ARRLENGTH;
            for (int j = 0; j < ARRLENGTH; j++) {
                if (emergency[i] > emergency[j]) {
                    System.out.println("emergency " + i + " = " + emergency[i] + ", emergency" + j +
                            " = " + +emergency[j]);
                    count--;
                    System.out.println("answer[i] = " + answer[i]);
                }
            }
            answer[i] = count;
        }
        for (int i : answer) {
            System.out.println(i);
        }
    }

}