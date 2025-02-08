package CodingTest_250119;

public class 삼육구게임 {
//3,6,9가 들어가는 숫자에 박수를 친다.
//    숫자가 매개변수로 주어지면, 해당 숫자에서 3,6,9를 찾아 그 횟수를 리턴한다.
public int solution(int order) {
    int answer = 0;
    char[] numArrays = String.valueOf(order).toCharArray();
    for (int i = 0; i < numArrays.length ; i++) {
        if (numArrays[i] == '3' || numArrays[i] == '6' || numArrays[i] == '9') {
            answer++;
        }
    }
    return answer;
}

//public int solution(int order) {
//    int answer = 0;
//    char[] numArrays = String.valueOf(order).toCharArray();
//    for (int i = 0; i < numArrays.length ; i++) {
//        if ((numArrays[i]-'0') % 3 == 0 && (numArrays[i]-'0') != 0) {
//            answer++;
//        }
//    }
//    return answer;
//}

//    타인의 풀이 개선
//    public int solution(int order) {
//        int answer = 0;
//        while(order != 0)
//        {
//            if(order % 10 == 3 || order % 10 == 6 || order % 10 == 9)
//            {
//                answer++;
//            }
//            order /= 10;
//        }
//        return answer;
//    }
}