package Exam_241220;

public class Pro_배열의유사도 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
//        s1에서 값 찾기
        for (int i = 0; i < s1.length; i++) {
//            s2에서 값 찾기
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}