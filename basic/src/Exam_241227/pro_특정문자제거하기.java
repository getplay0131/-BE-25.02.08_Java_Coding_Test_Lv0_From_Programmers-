package Exam_241227;

//문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

public class pro_특정문자제거하기 {

//    리플레이스 사용하여 간단히 반환
//    public String solution(String my_string, String letter) {
//        return my_string.replace(letter,"");
//    }

//charat이용하기
    public String solution(String my_string, String letter) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char target = my_string.charAt(i);
            if (target != letter.charAt(0)) { // letter가 한글자이기에 인덱스도 0이다
                answer += target;
            }
        }
        return answer;
    }
}