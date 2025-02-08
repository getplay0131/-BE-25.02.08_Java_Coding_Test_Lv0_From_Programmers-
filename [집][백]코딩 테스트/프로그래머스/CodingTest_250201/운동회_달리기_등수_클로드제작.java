package CodingTest_250201;
//문제 설명:
//학교 운동회에서 달리기 경주가 진행되었습니다. 각 학생들의 결승선 통과 기록(초)이 배열로 주어질 때,
//각 학생의 등수를 배열로 return하도록 solution 메서드를 완성해주세요.
//기록이 가장 작은 학생이 1등입니다.
public class 운동회_달리기_등수_클로드제작 {
    public int [] solution(double[] records){
        int [] answer = new int[records.length];
    return answer;
    }

    public static void main(String[] args) {
        double [] records = {12.5, 11.0, 11.0, 15.2, 13.8};
        int [] answer = new int[records.length];
        for (int i = 0; i < records.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public static void compareValues(double[] arr, int[] arrs, int idx){
        int grade = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
                arrs[idx] = count;
        }
    }
}