package Exam_241227;

//선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
//
//가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
//삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.

public class pro_삼각형의완성조건1 {
    public int solution(int[] sides) {
        int sides1 = sides[0];
        int sides2 = sides[1];
        int sides3 = sides[2];
        int maxTest = Math.max(sides1,sides2);
        int max = Math.max(maxTest, sides3);
        int answer = 0;
        if ((sides1+sides2 > max) && (sides1+sides3 > max) && (sides2+sides3 > max)) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}

// ai 제안 버전
//    public int solution(int[] sides) {
//        int maxSide = Math.max(sides[0], Math.max(sides[1], sides[2]));
//        int sum = sides[0] + sides[1] + sides[2];
//
//        return sum - maxSide > maxSide ? 1 : 2;
//    }