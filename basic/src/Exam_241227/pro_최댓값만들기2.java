package Exam_241227;

//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

public class pro_최댓값만들기2 {
    public int solution(int[] numbers) {
//        이중 반복문으로 외부는 첫번째 인덱스를 잡고 내부 반복문은 그 다음 수와의 곱을 최댓값과 비교해서 그보다 크면 최댓값을 갱신하고 제일 이후엔 결과 값에 해당 값을 담으면 될것 같다.

        int answer = -100000000;
        for (int i = 0; i < numbers.length ; i++) {
//            외부 반복문은 처음 인덱스에 고정
            for (int j = i+1 ;j < numbers.length ; j++) {
            int check = numbers[i] * numbers[j];
                if (answer < check) {
                    answer = check;
                }
            }
        }
        return answer;
    }
}

// 이코드의 문제점은 음수를 체크를 못한다는 것이다.
