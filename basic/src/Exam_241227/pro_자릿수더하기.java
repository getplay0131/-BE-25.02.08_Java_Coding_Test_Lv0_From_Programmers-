package Exam_241227;

//정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
public class pro_자릿수더하기 {
//    public int solution(int n) {
//        String stringToN = String.valueOf(n);
//        int answer = 0;
//        for (int i = 0; i < stringToN.length(); i++) {
//           answer +=  stringToN.charAt(i) -'0';
//        }
//        return answer;
//    }

    public int solution(int n) {
        int answer = 0;
        while (n != 0) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }
}