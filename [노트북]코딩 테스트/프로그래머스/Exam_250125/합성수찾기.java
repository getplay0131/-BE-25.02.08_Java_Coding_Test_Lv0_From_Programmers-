package Exam_250125;
//약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.

public class 합성수찾기 {
    public int solution(int n) {
        int answer = 0;
//        1단계 : 입력 받은 수를 반복문의 종료조건으로 설정 후 외부 반복문 설정
        for (int i = 1; i <= n; i++) {
//        2단계 : 내부 반복문을 이용하여, 외부 반복문의 인덱스를 내부 반복문의 종료 조건으로 설정후 나누어서 나머지가 0일 때 카운터를 증가시켜 카운터가 3 이상이면 내부 반복문 종료 후 합성수
            int counter = 1;
            for (int j = 1; j <= i; j++) {
                if (counter > 2) {
//        카운터 증가
                    answer++;
                    break;
                }
                if (i % j == 0) {
                    counter++;
                }
            }
//        3단계 : 입력 수까지 도달하면 합성수 카운터의 값을 반환
        }
            return answer;
    }
    public static void main(String[] args) {
        int answer = 1;

        int n = 15;
//        1단계 : 입력 받은 수를 반복문의 종료조건으로 설정 후 외부 반복문 설정
        for (int i = 1; i <= n; i++) {
//        2단계 : 내부 반복문을 이용하여, 외부 반복문의 인덱스를 내부 반복문의 종료 조건으로 설정후 나누어서 나머지가 0일 때 카운터를 증가시켜 카운터가 3 이상이면 내부 반복문 종료 후 합성수
                   int  counter = 1;
            for (int j = 1; j <= i; j++) {
                if (counter > 2) {
//        카운터 증가
                    answer++;
                    break;
                }
                if (i % j == 0) {
                    counter++;
                }
            }

        }
    }
}