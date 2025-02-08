package CodingTest_250119;

public class 숫자찾기 {
//    num중에 k가 있다면 해당 인덱스 리턴, 없으면 -1 리턴
//public int solution(int num, int k) {
//    int answer = 0;
//    boolean isFind = false;
//    char[] numArrays = String.valueOf(num).toCharArray();
//    for (int i = 0; i < numArrays.length ; i++) {
//        if ((numArrays[i] - '0') == k) {
//            answer = i+1;
//            isFind = true;
//            break;
//        }
//    }
//    if (!isFind) {
//        answer = -1;
//    }
//    return answer;
//}

public int solution(int num, int k) {
    int answer = String.valueOf(num).indexOf(String.valueOf(k));
    return answer == -1 ? answer : answer + 1;
}

}