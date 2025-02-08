package Exam_250126;
//문제 설명
//문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
public class 중복된문자제거 {
    public String solution(String my_string) {
        String answer = "";
//        입력 받은 문자열을 캐릭터 배열로 변환
        char [] charArr = my_string.toCharArray();
        printArr(charArr);
        StringBuilder sb = new StringBuilder();
//        스트링 빌더 선언하여 해당 문자 저장
        for (char c : charArr) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
//        이중 반복문 활용하여 비교
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        String answer = "";
        String my_string = "We are the world";
//        입력 받은 문자열을 캐릭터 배열로 변환
        char [] charArr = my_string.toCharArray();
        printArr(charArr);
        StringBuilder sb = new StringBuilder();
//        스트링 빌더 선언하여 해당 문자 저장
        for (char c : charArr) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
//        이중 반복문 활용하여 비교
    answer = sb.toString();
//        return answer;
    }

public static void printArr(char[] arr){
    for (Object object : arr) {
        System.out.print(object);
    }
    System.out.println();

}
}