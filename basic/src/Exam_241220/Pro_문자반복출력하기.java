package Exam_241220;

public class Pro_문자반복출력하기 {
//    public String solution(String my_string, int n) {
//        String answer = "";
//        for (int i = 0; i < my_string.length(); i++) {
//            for (int j = 0; j < n; j++) {
//            answer += my_string.charAt(i);
//            }
//        }
//        return answer;
//    }

    public String solution(String my_string, int n) {
//        String answer = "";
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer.append(my_string.charAt(i));
            }
        }

        return answer.toString();
    }


}