package Exam_250125;

//머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
public class 모스부호_1_self {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
//        스트링 빌더를 활용하여 값을 저장후 마지막에 문자열로 변환하면 되겠다.
        StringBuilder sb = new StringBuilder();
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//        1단계 : 입력 문자열 공백으로 분리
        String[] splitArr = letter.split(" ");
//        2단계 :  분리한 문자열을 모스부호와 비교후 일치하다면,동일한 인덱스의 알파벳을 스트링 빌더에 추가
        for (String string : splitArr) {
            for (int i = 0; i < morse.length; i++) {
                if (string.equals(morse[i])) {
                    sb.append(alphabet[i]);
                }
            }
        }
//        3단계 : 스트링 빌더를 문자열로 변환
        answer = sb.toString();
        return answer;
    }
}