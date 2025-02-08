package Exam_250125;

//머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
public class 모스부호_1 {
    public String solution(String letter) {
        String answer = "";

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
//        스트링 빌더를 활용하여 값을 저장후 마지막에 문자열로 변환하면 되겠다.
        StringBuilder sb = new StringBuilder();
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//        1단계 입력받은 문자열을 캐릭터 배열로 나눈다. 공백 분리 먼저
        String[] split = letter.split(" ");
        for (String string : split) {
            System.out.println(string);
        }
//        알파벳 배열의 값과 입력값 비교
        for (String string : split) {
            for (int i = 0; i < morse.length; i++) {
                if (string.equals(morse[i])) {
                    sb.append(alphabet[i]);
                    break;
                }
            }
        }
        answer = sb.toString();
        System.out.println(answer);
        return answer;
    }


//    public static void main(String[] args) {
//        String letter = ".... . .-.. .-.. ---";
//        String answer = "";
//
//        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
//                ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
////        스트링 빌더를 활용하여 값을 저장후 마지막에 문자열로 변환하면 되겠다.
//        StringBuilder sb = new StringBuilder();
//        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
////        1단계 입력받은 문자열을 캐릭터 배열로 나눈다. 공백 분리 먼저
//        String[] split = letter.split(" ");
//        for (String string : split) {
//            System.out.println(string);
//        }
////        알파벳 배열의 값과 입력값 비교
//        for (String string : split) {
//            for (int i = 0; i < morse.length; i++) {
//                if (string.equals(morse[i])) {
//                    sb.append(alphabet[i]);
//                    break;
//                }
//            }
//        }
//    answer = sb.toString();
//        System.out.println(answer);
//    }
}